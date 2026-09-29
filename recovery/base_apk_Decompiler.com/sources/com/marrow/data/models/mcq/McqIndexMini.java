package com.marrow.data.models.mcq;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.models.EncryptedContentObject;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000b8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f"}, d2 = {"Lcom/marrow/data/models/mcq/McqIndexMini;", "Lcom/marrow/data/models/EncryptedContentObject;", "Lcom/marrow/data/models/mcq/McqContentBody;", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setEncrypt", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "setMcqIdFromResponse", "", "p1", "(Ljava/lang/String;Ljava/lang/String;)V", "newEncryptedObject", "()Lcom/marrow/data/models/mcq/McqContentBody;", "mcqId", "Ljava/lang/String;", "getMcqId", "()Ljava/lang/String;", "setMcqId", "(Ljava/lang/String;)V", "rootSubjectId", "getRootSubjectId", "setRootSubjectId", "mcqEncrypt", "getMcqEncrypt", "setMcqEncrypt", "getMcqContentBody", "mcqContentBody"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class McqIndexMini extends EncryptedContentObject<McqContentBody> {

    @JsonProperty("_id")
    private String mcqId = "";

    @JsonProperty("root_subject_id")
    private String rootSubjectId = "";
    private String mcqEncrypt = "";

    public final String getMcqId() {
        return this.mcqId;
    }

    public final void setMcqId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.mcqId = str;
    }

    public String getRootSubjectId() {
        return this.rootSubjectId;
    }

    public void setRootSubjectId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.rootSubjectId = str;
    }

    protected final String getMcqEncrypt() {
        return this.mcqEncrypt;
    }

    protected final void setMcqEncrypt(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.mcqEncrypt = str;
    }

    @JsonSetter("mcq_encrypt")
    public final void setEncrypt(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strAsText = p0.asText();
        toMagicModuleMetaRepoModel.write((Object) strAsText);
        this.mcqEncrypt = strAsText;
        initEncryptedContent(this.mcqId, strAsText);
    }

    @JsonSetter("_id")
    public final void setMcqIdFromResponse(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strAsText = p0.asText();
        toMagicModuleMetaRepoModel.write((Object) strAsText);
        this.mcqId = strAsText;
        initEncryptedContent(strAsText, this.mcqEncrypt);
    }

    @JsonIgnore
    public final void setEncrypt(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        initEncryptedContent(p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.marrow.data.models.EncryptedContentObject
    public McqContentBody newEncryptedObject() {
        return new McqContentBody();
    }

    public final McqContentBody getMcqContentBody() {
        return (McqContentBody) super.getDecryptedContent();
    }
}
