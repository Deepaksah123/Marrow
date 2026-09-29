package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.getRfBanners, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0013\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0005¨\u0006 "}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue$annotations", "()V", "isSuccess", "", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isFailure", "isFailure-impl", "getOrNull", "getOrNull-impl", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "equals", "other", "hashCode", "", "Companion", "Failure", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@submitMagicModule
public final class C0177getRfBanners<T> implements Serializable {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
    private final Object RemoteActionCompatParcelizer;

    public static <T> Object read(Object obj) {
        return obj;
    }

    private /* synthetic */ C0177getRfBanners(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    public static final boolean write(Object obj) {
        return !(obj instanceof AudioAttributesCompatParcelizer);
    }

    public static final boolean RemoteActionCompatParcelizer(Object obj) {
        return obj instanceof AudioAttributesCompatParcelizer;
    }

    public static final Throwable IconCompatParcelizer(Object obj) {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            return ((AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer;
        }
        return null;
    }

    public final String toString() {
        return MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
    }

    private static String MediaBrowserCompatItemReceiver(Object obj) {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            return ((AudioAttributesCompatParcelizer) obj).toString();
        }
        StringBuilder sb = new StringBuilder("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static final /* synthetic */ C0177getRfBanners AudioAttributesCompatParcelizer(Object obj) {
        return new C0177getRfBanners(obj);
    }

    private static boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return (obj2 instanceof C0177getRfBanners) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, ((C0177getRfBanners) obj2).getRemoteActionCompatParcelizer());
    }

    private static int AudioAttributesImplApi26Parcelizer(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object other) {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, other);
    }

    public final int hashCode() {
        return AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.getRfBanners$IconCompatParcelizer */
    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getRfBanners$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ Object getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.getRfBanners$AudioAttributesCompatParcelizer */
    /* JADX INFO: loaded from: classes4.dex */
    public static final class AudioAttributesCompatParcelizer implements Serializable {
        public final Throwable AudioAttributesCompatParcelizer;

        public AudioAttributesCompatParcelizer(Throwable th) {
            toMagicModuleMetaRepoModel.write(th, "");
            this.AudioAttributesCompatParcelizer = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
