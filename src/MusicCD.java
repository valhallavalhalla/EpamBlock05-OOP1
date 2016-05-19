import java.util.Date;

/**
 * MusicCD is the class for representing a simple
 * musical compact disk.
 * A MusicCD object encapsulates the description
 * about all main information of musical compact disk.
 *  This state information includes:
 * <ul>
 * <li>The artist
 * <li>The composer
 * <li>the title
 * <li>The favorite track
 * <li>The purchase date
 * <li>The customer name
 * <li>The tracks count
 * <li>The duration of all tracks
 * </ul>
 *
 * @author Andrii Shchavinskyi
 */
public class MusicCD {

    private String artist;
    private String composer;
    private String title;
    private int tracksCount;
    private int duration;
    private String favoriteTrack;
    private Date purchaseDate;
    private String customerName;

    /**
     * Default constructor.
     */
    public MusicCD() {
        this.artist = null;
        this.composer = null;
        this.title = null;
        this.tracksCount = 0;
        this.duration = 0;
        this.favoriteTrack = null;
        this.purchaseDate = null;
        this.customerName = null;
    }

    /**
     *
     * @param artist
     * @param composer
     * @param title
     * @param tracksCount
     * @param duration
     * @param favoriteTrack
     * @param purchaseDate
     * @param customerName
     */
    public MusicCD(String artist, String composer, String title, int tracksCount, int duration,
                   String favoriteTrack, Date purchaseDate, String customerName) {
        this.artist = artist;
        this.composer = composer;
        this.title = title;
        this.tracksCount = tracksCount;
        this.duration = duration;
        this.favoriteTrack = favoriteTrack;
        this.purchaseDate = purchaseDate;
        this.customerName = customerName;
    }

    /**
     * Creates short CD description that
     * consist from name and CD title.
     *
     * @return string of short CD description
     */
    public String getShortDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Artist: ").append(artist)
                .append(", Title: ").append(title);
        return stringBuilder.toString();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTracksCount() {
        return tracksCount;
    }

    public void setTracksCount(int tracksCount) {
        this.tracksCount = tracksCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFavoriteTrack() {
        return favoriteTrack;
    }

    public void setFavoriteTrack(String favoriteTrack) {
        this.favoriteTrack = favoriteTrack;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicCD musicCD = (MusicCD) o;

        if (getTracksCount() != musicCD.getTracksCount()) return false;
        if (getDuration() != musicCD.getDuration()) return false;
        if (getArtist() != null ? !getArtist().equals(musicCD.getArtist())
                : musicCD.getArtist() != null) return false;
        if (getComposer() != null ? !getComposer().equals(musicCD.getComposer())
                : musicCD.getComposer() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(musicCD.getTitle())
                : musicCD.getTitle() != null) return false;
        if (getFavoriteTrack() != null ? !getFavoriteTrack().equals(musicCD.getFavoriteTrack())
                : musicCD.getFavoriteTrack() != null)
            return false;
        if (getPurchaseDate() != null ? !getPurchaseDate().equals(musicCD.getPurchaseDate())
                : musicCD.getPurchaseDate() != null)
            return false;
        return getCustomerName() != null ? getCustomerName().equals(musicCD.getCustomerName())
                : musicCD.getCustomerName() == null;
    }

    @Override
    public int hashCode() {
        int value = 31;
        int result = getArtist() != null ? getArtist().hashCode() : 0;
        result = value * result + (getComposer() != null ? getComposer().hashCode() : 0);
        result = value * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = value * result + getTracksCount();
        result = value * result + getDuration();
        result = value * result + (getFavoriteTrack() != null ? getFavoriteTrack().hashCode() : 0);
        result = value * result + (getPurchaseDate() != null ? getPurchaseDate().hashCode() : 0);
        result = value * result + (getCustomerName() != null ? getCustomerName().hashCode() : 0);
        return result;
    }

}
