package com.akshayashokcode.newsapiclient.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.akshayashokcode.newsapiclient.data.model.Article
import com.akshayashokcode.newsapiclient.databinding.NewsListItemBinding
import com.bumptech.glide.Glide

class NewsAdapter {

    inner class newsViewHolder(
        val binding:NewsListItemBinding
    ):RecyclerView.ViewHolder(binding.root){

        fun bind(article:Article){
            binding.tvTitle.text=article.title
            binding.tvDescription.text=article.description
            binding.tvPublishedAt.text=article.publishedAt
            binding.tvSource.text=article.source.name

            Glide.with(binding.ivArticleImage.context).load(article.urlToImage)
                .into(binding.ivArticleImage)
        }
    }
}