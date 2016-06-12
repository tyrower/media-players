
package org.onebeartoe.media.piezo.ports.rtttl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Marquez
 * @modified Alan McCullagh - addition Prince Medely & Misc
 */
public class BuiltInSongs
{
    private final String[] songData =
    {
        "Raspberry Beret:d=4,o=5,b=50:32f.,32g.,32a#.,8d.6,32c.6,32d.6,32c.6,a#,32a#.,32a#.,16c.6,32c.6,8c6,32a#.,32c.6,32c.6,32a#.,16c.6,8a#.,8d.6,32c.6,32d.6,32c.6,a#,32a#.,32c.6,32c.6,32c.6,16c.6,32a#.,32a#.,32a#.,16c.6,16a#.,8a#.,8d.6,32c.6,32d.6,32c.6,a#,32f.,32g.,32a#.,8c.6,32d.6,16c.6,a#",
        "1999:d=4,o=6,b=80:16c#.,16c#.,16a#.,16a#.,16a#.,16a#.,16b.,8b.,16b.,16g#.,16g#.,16g#.,16g#.,16g#.,16f#.,2a#,16c#.5,16c#.5,16c#.5,16f#.5,16f#.5,8f#.5,16g#.5,16g#.5,16g#.5,16g#.5,16d#.5,16d#.5,8d#.5,16d#.5,16c#.5,2f#5",
        "When Doves Cry:d=4,o=5,b=31:32a#,32a#,32a#,16a#,32a#,32a#,16a#,8g#.,32g#,32g#,32g#,16g#,16a#,16a#,8f.,32a#,32a#,32a#,16a#,32a#,32b6,32a#,8g#.,32g#,32g#,32g#,32g#,16g#,16g#.,16f,16g#.,16a#.",
        "Purple Rain:d=4,o=5,b=112:f6,g6,a6,p,8a6,8g6,8f6,f.6,p,8a#,8p,p,8a#,8p,p,8a#,8p,p,8a#,8p,p,f6,g6,a6,p,8a6,8g6,8f6,f.6,p,8f,8p,p,8f,8p,p,8f,8p,p,8d,8p,p,f6,g6,a6,p,8a6,8g6,8f6,c.6,p,8c,8p,p,8c,8p,p,8c,8p,p,8c,8p,p,8c,8p,p,8c,8p,p,8c,8p,p,a#6,a#6,a#6,a#6,a#6,a#6,a#6,a#6,a#6,a#6,a6,g6,f.6"
    };
    
    List<RtttlSong> songsList;
    
    public BuiltInSongs()
    {
        songsList = new ArrayList();
        
        for(String data : songData)
        {
            RtttlSong song = new RtttlSong(data);
            
            songsList.add(song);
        }
    }
    
    public List<RtttlSong> getSongs()
    {
        return songsList;
    }
}
