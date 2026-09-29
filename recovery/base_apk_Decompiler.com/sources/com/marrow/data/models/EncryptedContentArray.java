package com.marrow.data.models;

import android.text.TextUtils;
import kotlin.DashManifestParser;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class EncryptedContentArray<T extends notifyManifestPublishTimeExpired> {
    private T[] mDecryptedContent;
    protected String mEncryptedContent;

    protected abstract T[] newEncryptedArray(int i);

    protected abstract T newEncryptedObject();

    /* JADX WARN: Multi-variable type inference failed */
    private T[] decryptSync(String str) {
        String str2 = this.mEncryptedContent;
        if (!TextUtils.isEmpty(str2)) {
            String strIconCompatParcelizer = DashManifestParser.IconCompatParcelizer(str, str2);
            if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                return null;
            }
            Object obj = parseLastSegmentNumberSupplementalProperty.read(strIconCompatParcelizer);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                T[] tArr = (T[]) newEncryptedArray(length);
                for (int i = 0; i < length; i++) {
                    notifyManifestPublishTimeExpired notifymanifestpublishtimeexpiredNewEncryptedObject = newEncryptedObject();
                    notifymanifestpublishtimeexpiredNewEncryptedObject.fromJSON(jSONArray.optJSONObject(i));
                    tArr[i] = notifymanifestpublishtimeexpiredNewEncryptedObject;
                }
                return tArr;
            }
        }
        return null;
    }

    public void initEncryptedContent(String str, String str2) {
        this.mEncryptedContent = str2;
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str) || parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str2)) {
            return;
        }
        this.mDecryptedContent = (T[]) decryptSync(str);
    }

    public String getEncryptedContent() {
        return this.mEncryptedContent;
    }

    public T[] getDecryptedContent() {
        return this.mDecryptedContent;
    }
}
