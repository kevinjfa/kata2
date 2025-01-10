package es.software.ulpgc.kata2;

public class Title {
    private final String id;
    private final TitleType type;
    private final String primaryTitle;

    public Title(String id, TitleType type, String primaryTitle) {
        this.id = id;
        this.type = type;
        this.primaryTitle = primaryTitle;
    }

    public String getId() {
        return id;
    }

    public TitleType getType() {
        return type;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public enum TitleType {
        VideoGame,
        TvPilot,
        Movie,
        TvSeries,
        TvMiniSeries,
        Short,
        TvSpecial,
        TvShort,
        Video,
        TvMovie,
        TvEpisode
    }
}
