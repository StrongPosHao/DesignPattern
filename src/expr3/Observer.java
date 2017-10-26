package expr3;

public interface Observer {
	
	public void update(boolean isEastPass, boolean isSouthPass, boolean isWestPass, boolean isNorthPass, MainFrame frame) throws InterruptedException;
}
