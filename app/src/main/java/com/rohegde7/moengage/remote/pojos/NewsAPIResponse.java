package com.rohegde7.moengage.remote.pojos;

import java.util.List;

public class NewsAPIResponse {

    String status;
    List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
