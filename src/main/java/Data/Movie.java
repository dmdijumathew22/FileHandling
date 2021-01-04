package Data;

public class Movie {

	String title, title_type, directors, runtime, year, genres, url,votes,top250, mw1001, imdb_rtng;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_type() {
		return title_type;
	}
	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getVotes() {
		return votes;
	}
	public void setVotes(String votes) {
		this.votes = votes;
	}
	public String getTop250() {
		return top250;
	}
	public void setTop250(String top250) {
		this.top250 = top250;
	}
	public String getMw1001() {
		return mw1001;
	}
	public void setMw1001(String mw1001) {
		this.mw1001 = mw1001;
	}
	public String getImdb_rtng() {
		return imdb_rtng;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", title_type=" + title_type + ", directors=" + directors + ", runtime="
				+ runtime + ", year=" + year + ", genres=" + genres + ", url=" + url + ", votes=" + votes + ", top250="
				+ top250 + ", mw1001=" + mw1001 + ", imdb_rtng=" + imdb_rtng + "]";
	}
	public void setImdb_rtng(String data) {
		this.imdb_rtng = data;
	}
}
