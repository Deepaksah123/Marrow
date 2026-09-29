package com.marrow.data.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonDeserialize(using = UserConfigDeserializer.class)
@JsonSerialize(using = UserConfigSerializer.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/marrow/data/models/user/UserConfigResponse;", "", "", "p0", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/marrow/data/models/user/UserConfigResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "showPearlDeletionPopup", "Z", "getShowPearlDeletionPopup", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserConfigResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean showPearlDeletionPopup;

    public UserConfigResponse(boolean z) {
        this.showPearlDeletionPopup = z;
    }

    public /* synthetic */ UserConfigResponse(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getShowPearlDeletionPopup() {
        return this.showPearlDeletionPopup;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/user/UserConfigResponse$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/user/UserConfigResponse;", "fromJson", "(Ljava/lang/String;)Lcom/marrow/data/models/user/UserConfigResponse;", "toJson", "(Lcom/marrow/data/models/user/UserConfigResponse;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final UserConfigResponse fromJson(String p0) throws JsonProcessingException {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object value = new ObjectMapper().readValue(p0, (Class<Object>) UserConfigResponse.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
            return (UserConfigResponse) value;
        }

        public final String toJson(UserConfigResponse p0) throws JsonProcessingException {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strWriteValueAsString = new ObjectMapper().writeValueAsString(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWriteValueAsString, "");
            return strWriteValueAsString;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public UserConfigResponse() {
        this(false, 1, null);
    }

    public static /* synthetic */ UserConfigResponse copy$default(UserConfigResponse userConfigResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userConfigResponse.showPearlDeletionPopup;
        }
        return userConfigResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowPearlDeletionPopup() {
        return this.showPearlDeletionPopup;
    }

    public final UserConfigResponse copy(boolean p0) {
        return new UserConfigResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof UserConfigResponse) && this.showPearlDeletionPopup == ((UserConfigResponse) p0).showPearlDeletionPopup;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showPearlDeletionPopup);
    }

    public final String toString() {
        boolean z = this.showPearlDeletionPopup;
        StringBuilder sb = new StringBuilder("UserConfigResponse(showPearlDeletionPopup=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
