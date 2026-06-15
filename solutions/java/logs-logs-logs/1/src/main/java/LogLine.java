public class LogLine {

    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(logLine.indexOf('[')+1, logLine.indexOf(']'));
        for(LogLevel n : LogLevel.values()) {
            if(n.lookupLvl().equals(level)) {
                return n;
            }
        }
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        LogLevel l = getLogLevel();
        String message = logLine.substring(logLine.indexOf(']')+2).trim();
        return String.format("%d:%s", l.lookupNum(), message);
    }
    }

