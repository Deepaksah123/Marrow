package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import in.juspay.hypersdk.core.PaymentConstants;

/* JADX INFO: loaded from: classes.dex */
public final class sniffInternal {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    private sniffInternal(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.read = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.IconCompatParcelizer = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
        this.AudioAttributesImplApi21Parcelizer = str7;
    }

    public static sniffInternal write(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new sniffInternal(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString(PaymentConstants.PROJECT_ID));
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sniffInternal)) {
            return false;
        }
        sniffInternal sniffinternal = (sniffInternal) obj;
        return Objects.equal(this.read, sniffinternal.read) && Objects.equal(this.write, sniffinternal.write) && Objects.equal(this.AudioAttributesCompatParcelizer, sniffinternal.AudioAttributesCompatParcelizer) && Objects.equal(this.RemoteActionCompatParcelizer, sniffinternal.RemoteActionCompatParcelizer) && Objects.equal(this.IconCompatParcelizer, sniffinternal.IconCompatParcelizer) && Objects.equal(this.AudioAttributesImplBaseParcelizer, sniffinternal.AudioAttributesImplBaseParcelizer) && Objects.equal(this.AudioAttributesImplApi21Parcelizer, sniffinternal.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        return Objects.hashCode(this.read, this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.read).add("apiKey", this.write).add("databaseUrl", this.AudioAttributesCompatParcelizer).add("gcmSenderId", this.IconCompatParcelizer).add("storageBucket", this.AudioAttributesImplBaseParcelizer).add("projectId", this.AudioAttributesImplApi21Parcelizer).toString();
    }
}
