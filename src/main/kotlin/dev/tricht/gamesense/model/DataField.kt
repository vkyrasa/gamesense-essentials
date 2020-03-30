package dev.tricht.gamesense.model

import com.fasterxml.jackson.annotation.JsonProperty

data class DataField(
    @JsonProperty("context-frame-key")
    val contextFrameKey: String,
    val label: String
)