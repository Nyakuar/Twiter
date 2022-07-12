package dev.nyakuar.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nyakuar.twitter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet = Tweets("Nyakuar @nyakuar122 Jul 9,2022","Software Developer","","","34","","10","50","218","","20")
        var tweet1 = Tweets("Jane  @jane Jul 9,2022","MachineLearning,AI","","","12","","5","54","318","","10")
        var tweet2 = Tweets("Kully @cool Jul 9,2022","Hello World","","","48","","10","50","218","","30")
        var tweet3 = Tweets("Lonachris @chris Jul 8,2022","#Django","","","34","","14","50","400","","40")
        var tweet4 = Tweets("Sabz @sab Jul 8,2022","#Techmatters","","","40","","10","26","322","","22")
        var tweet5 = Tweets("Trevor @bigboys Jul 8,2022","#Techmatters","","","28","","12","26","132","","43")


        var tweetsList = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)

        var twitterAdapter = TweetRvAdapter(tweetsList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = twitterAdapter
    }
}
