package shared;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	private Logger logger;
	
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter
			.ofPattern("dd/mm/yyyy - HH:mm:ss")
			.withZone(ZoneId.systemDefault());
	
	public MyLogger(String loggerClassname) {
		logger = Logger.getLogger(loggerClassname);
		ConsoleHandler consoleHandler = new ConsoleHandler();
		
		consoleHandler.setFormatter(new SimpleFormatter() {
			@Override
			public String format(LogRecord logRecord) {
				String dateFormat = DATE_TIME_FORMATTER.format(logRecord.getInstant());
				return String.format("[%s] [%s] %s: %s%n",
						dateFormat,
						logRecord.getLoggerName(),
						logRecord.getLevel(),
						logRecord.getMessage());
			}
			
		});
		logger.addHandler(consoleHandler);
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.ALL);
	}
	
	public void info(String message) {
		this.logger.info(message);
	}
	public void warning(String message) {
		this.logger.warning(message);
	}
	public void severe(String message) {
		this.logger.severe(message);
	}
}