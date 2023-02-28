public class FacadeAPI{
    public FacadeAPI(){
    }

    public void getTweets(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken); 
    }

}