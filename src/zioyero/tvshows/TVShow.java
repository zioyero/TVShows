package zioyero.tvshows;

/**
 * Class will serve as the foundation object of the TVShow Database. Each of these
 * objects will have fields pertaining to their basic information.
 * @TODO Create Episode class and Season class. 
 * @author zioyero
 *
 */
public class TVShow 
{
	private String name;
	private String seriesID;
	private int ID;
	private int numSeasons;
	private int numEpisodes;
	
	/** 
	 * Constructor 
	 */
	public TVShow()
	{
		name = null;
		seriesID = null;
		ID = 0;
		numSeasons = 0;
		numEpisodes = 0;
	}
	
	public TVShow(String n)
	{
		name = n;
		seriesID = getSeriesID(name);
		ID = Integer.parseInt(seriesID);
		numSeasons = getNumberOfSeasons(seriesID);
		numEpisodes = getNumberOfEpisodes(seriesID);
	}
	
	/**
	 * @param showName Name of the series
	 * @return String containing the series ID of the show.
	 */
	public String getSeriesID(String showName)
	{
		return null;
	}
	
	public String getSeriesID()
	{
		return seriesID;
	}
	
	/**
	 * 
	 * @param seriesID
	 * @return
	 */
	public String getShowName(String seriesID)
	{
		return null;
	}
	
	public String getShowName()
	{
		return name;
	}
	
	public int getNumberOfSeasons(String seriesId)
	{
		return 0;
	}
	
	public int getNumberOfSeasons()
	{
		return numSeasons;
	}
	
	public int getNumberOfEpisodes(String seriesId)
	{
		return 0;
	}
	
	public int getNumberOfEpisodes()
	{
		return numEpisodes;
	}
	
}
