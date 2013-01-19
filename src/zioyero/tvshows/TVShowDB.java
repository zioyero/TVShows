package zioyero.tvshows;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.xmlpull.v1.*;

public class TVShowDB 
{
	public void main(String[] args) throws XmlPullParserException, IOException
	{
		getSeriesID("Suburgatory");
	}
	
	public String getSeriesID(String showName) throws XmlPullParserException, IOException
	{
		String url = "http://www.thetvdb.com/api/GetSeries.php?seriesname="+showName;
		URL results = new URL(url);
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);
		XmlPullParser xpp = factory.newPullParser();
		xpp.setInput((InputStream)results.getContent(), null);
		
		return null;
	}
}
