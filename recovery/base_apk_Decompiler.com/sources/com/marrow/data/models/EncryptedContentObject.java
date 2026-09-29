package com.marrow.data.models;

import kotlin.DashManifestParser;
import kotlin.Metadata;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0007@BX\u0087.¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00008\u0007@BX\u0087.¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000f"}, d2 = {"Lcom/marrow/data/models/EncryptedContentObject;", "Lo/notifyManifestPublishTimeExpired;", "T", "", "<init>", "()V", "", "p0", "decryptSync", "(Ljava/lang/String;)Lo/notifyManifestPublishTimeExpired;", "p1", "", "initEncryptedContent", "(Ljava/lang/String;Ljava/lang/String;)V", "newEncryptedObject", "()Lo/notifyManifestPublishTimeExpired;", "encryptedContent", "Ljava/lang/String;", "getEncryptedContent", "()Ljava/lang/String;", "decryptedContent", "Lo/notifyManifestPublishTimeExpired;", "getDecryptedContent"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EncryptedContentObject<T extends notifyManifestPublishTimeExpired> {
    private T decryptedContent;
    private String encryptedContent;

    protected abstract T newEncryptedObject();

    public final String getEncryptedContent() {
        String str = this.encryptedContent;
        if (str != null) {
            return str;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final T getDecryptedContent() {
        T t = this.decryptedContent;
        if (t != null) {
            return t;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private final T decryptSync(String p0) {
        String encryptedContent = getEncryptedContent();
        if (encryptedContent.length() > 0) {
            String strIconCompatParcelizer = DashManifestParser.IconCompatParcelizer(p0, encryptedContent);
            toMagicModuleMetaRepoModel.write((Object) strIconCompatParcelizer);
            if (strIconCompatParcelizer.length() == 0) {
                throw new NullPointerException("MCQ-ERR: Content description not found");
            }
            Object obj = parseLastSegmentNumberSupplementalProperty.read(strIconCompatParcelizer);
            if (obj instanceof JSONObject) {
                T t = (T) newEncryptedObject();
                t.fromJSON((JSONObject) obj);
                return t;
            }
        }
        throw new NullPointerException("MCQ-ERR: Content not found");
    }

    public final void initEncryptedContent(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.encryptedContent = p1;
        if (p0.length() == 0 || p1.length() == 0) {
            return;
        }
        this.decryptedContent = (T) decryptSync(p0);
    }
}
