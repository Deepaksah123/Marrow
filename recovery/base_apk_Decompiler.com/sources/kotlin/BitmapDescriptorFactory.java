package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/marrow2/ui/signup/college/model/CollegeSelection;", "", "stateId", "", "countryId", "collegeId", "collegeName", "yoa", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStateId", "()Ljava/lang/String;", "getCountryId", "getCollegeId", "getCollegeName", "getYoa", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BitmapDescriptorFactory {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    private BitmapDescriptorFactory(String str, String str2, String str3, String str4, String str5) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = str3;
        this.write = str4;
        this.IconCompatParcelizer = str5;
    }

    public /* synthetic */ BitmapDescriptorFactory(String str, String str2, String str3, String str4, String str5, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public BitmapDescriptorFactory() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BitmapDescriptorFactory RemoteActionCompatParcelizer(BitmapDescriptorFactory bitmapDescriptorFactory, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = bitmapDescriptorFactory.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            str2 = bitmapDescriptorFactory.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            str3 = bitmapDescriptorFactory.read;
        }
        if ((i & 8) != 0) {
            str4 = bitmapDescriptorFactory.write;
        }
        if ((i & 16) != 0) {
            str5 = bitmapDescriptorFactory.IconCompatParcelizer;
        }
        return IconCompatParcelizer(str, str2, str3, str4, str5);
    }

    private static BitmapDescriptorFactory IconCompatParcelizer(String str, String str2, String str3, String str4, String str5) {
        return new BitmapDescriptorFactory(str, str2, str3, str4, str5);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapDescriptorFactory)) {
            return false;
        }
        BitmapDescriptorFactory bitmapDescriptorFactory = (BitmapDescriptorFactory) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) bitmapDescriptorFactory.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) bitmapDescriptorFactory.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) bitmapDescriptorFactory.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) bitmapDescriptorFactory.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) bitmapDescriptorFactory.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.read;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.IconCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.read;
        String str4 = this.write;
        String str5 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("CollegeSelection(stateId=");
        sb.append(str);
        sb.append(", countryId=");
        sb.append(str2);
        sb.append(", collegeId=");
        sb.append(str3);
        sb.append(", collegeName=");
        sb.append(str4);
        sb.append(", yoa=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
