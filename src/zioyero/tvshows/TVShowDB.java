package zioyero.tvshows;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xmlpull.v1.*;

public class TVShowDB 
{	
	public static String getSeriesID(String showName) throws XmlPullParserException, IOException
	{
		String url = "http://www.thetvdb.com/api/GetSeries.php?seriesname="+showName;
		URL results = new URL(url);
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);
		XmlPullParser xpp = factory.newPullParser();
		xpp.setInput((InputStream)results.getContent(), null);
		
		int eventType = xpp.getEventType();
		while(eventType != XmlPullParser.END_DOCUMENT)
		{
			if(eventType == XmlPullParser.START_DOCUMENT)
			{
				System.out.println("Start Document");
			}
			else if(eventType == XmlPullParser.START_TAG)
			{
				System.out.println("Start Tag: " + xpp.getName());
			}
			else if(eventType == XmlPullParser.END_TAG)
			{
				System.out.println("End Tag: " + xpp.getName());
			}
			else if (eventType == XmlPullParser.TEXT)
			{
				System.out.println("Content: "+ xpp.getText());
			}
			
			eventType = xpp.next();
		}
		
		return null;
	}
}
