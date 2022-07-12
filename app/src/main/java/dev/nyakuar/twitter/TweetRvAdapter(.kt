package dev.nyakuar.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter( var tweetsList: List<Tweets>):
    RecyclerView.Adapter<TweetRvAdapter.tweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetsViewHolder {
        var itemView = LayoutInflater .from(parent.context)
            .inflate(R.layout.twitter_list_item, parent, false)
        return tweetsViewHolder((itemView))

    }

    override fun onBindViewHolder(holder: tweetsViewHolder, position: Int) {
        var currentTweet = tweetsList.get(position)
        holder.tvHandles.text = currentTweet.Handles
        holder.tvRetweets.text = currentTweet.Retweets
        holder.tvcomments.text = currentTweet.comments
        holder.tvTweet.text = currentTweet.Tweet
        holder.tvhearts.text = currentTweet.hearts
        holder.tvshares.text = currentTweet.shares

    }
    override fun getItemCount(): Int {
        return tweetsList.size

    }
    class tweetsViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var tvHandles = itemView.findViewById<TextView>(R.id.tvHandles)
        var tvTweet = itemView.findViewById<TextView>(R.id.tvtweet)
        var tvcomments = itemView.findViewById<TextView>(R.id.tvcomments)
        var tvRetweets = itemView.findViewById<TextView>(R.id.tvRetweets)
        var tvhearts = itemView.findViewById<TextView>(R.id.tvhearts)
        var tvshares = itemView.findViewById<TextView>(R.id.tvshares)
        var ivAvator = itemView.findViewById<ImageView>(R.id.ivAvator)
        var imageView = itemView.findViewById<ImageView>(R.id.imgComment)
        var imgHeart = itemView.findViewById<ImageView>(R.id.imgHeart)
        var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
        var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)
    }
}

