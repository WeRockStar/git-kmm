package com.werockstar.git_kmm.data.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
class GitUserResponse(
    @SerialName("avatar_url")
    val avatarUrl: String?,
    @SerialName("events_url")
    val eventsUrl: String,
    @SerialName("followers_url")
    val followersUrl: String,
    @SerialName("following_url")
    val followingUrl: String,
    @SerialName("gists_url")
    val gistsUrl: String,
    @SerialName("gravatar_id")
    val gravatarId: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("id")
    val id: Int,
    @SerialName("login")
    val username: String,
    @SerialName("url")
    val url: String,
    @SerialName("name")
    val name: String?,
    @SerialName("company")
    val company: String?
)