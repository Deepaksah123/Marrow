package com.marrow.data.api.models.response.mcq;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.marrow.data.models.mcq.McqIndex;
import com.marrow.data.models.mcq.McqPearlInfo;
import com.marrow.data.models.pearl.Pearl;
import java.util.ArrayList;
import kotlin.parseText;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class McqResponseBody extends McqIndex {

    @JsonIgnore
    ArrayList<Pearl> mPearls = new ArrayList<>();

    @Override // com.marrow.data.models.mcq.McqIndex
    @JsonSetter("pearl_ids")
    public void setPearlIds(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            ArrayNode arrayNode = (ArrayNode) jsonNode;
            this.pearlIds = new McqPearlInfo[arrayNode.size()];
            this.mPearls = Pearl.fromJsonArray2(arrayNode, true);
            this.pearlIds = parseText.AudioAttributesCompatParcelizer(getMcqId(), this.mPearls);
        }
    }

    public ArrayList<Pearl> getPearls() {
        return this.mPearls;
    }
}
