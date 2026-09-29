package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import coil.size.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
public interface MemoryCache {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "<init>", "()V", "AudioAttributesCompatParcelizer", "Complex", "Lcoil/memory/MemoryCache$Key$Complex;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Key implements Parcelable {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        private Key() {
        }

        /* JADX INFO: renamed from: coil.memory.MemoryCache$Key$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public /* synthetic */ Key(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcoil/memory/MemoryCache$Key$Complex;", "Lcoil/memory/MemoryCache$Key;", "", "p0", "", "p1", "Lcoil/size/Size;", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcoil/size/Size;Ljava/util/Map;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "Ljava/util/Map;", "write", "Lcoil/size/Size;", "()Lcoil/size/Size;", "IconCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class Complex extends Key {
            public static final Parcelable.Creator<Complex> CREATOR = new AudioAttributesCompatParcelizer();

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
            private final List<String> AudioAttributesCompatParcelizer;
            private final String RemoteActionCompatParcelizer;
            private final Map<String, String> read;
            private final Size write;

            public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<Complex> {
                private static Complex RemoteActionCompatParcelizer(Parcel parcel) {
                    toMagicModuleMetaRepoModel.write(parcel, "");
                    String string = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    Size size = (Size) parcel.readParcelable(Complex.class.getClassLoader());
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new Complex(string, arrayListCreateStringArrayList, size, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Complex createFromParcel(Parcel parcel) {
                    return RemoteActionCompatParcelizer(parcel);
                }

                private static Complex[] AudioAttributesCompatParcelizer(int i) {
                    return new Complex[i];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Complex[] newArray(int i) {
                    return AudioAttributesCompatParcelizer(i);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: write, reason: from getter */
            public final Size getWrite() {
                return this.write;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Complex(String str, List<String> list, Size size, Map<String, String> map) {
                super(null);
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(list, "");
                toMagicModuleMetaRepoModel.write(map, "");
                this.RemoteActionCompatParcelizer = str;
                this.AudioAttributesCompatParcelizer = list;
                this.write = size;
                this.read = map;
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof Complex)) {
                    return false;
                }
                Complex complex = (Complex) p0;
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) complex.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, complex.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, complex.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, complex.read);
            }

            public final int hashCode() {
                int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
                int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
                Size size = this.write;
                return (((((iHashCode * 31) + iHashCode2) * 31) + (size == null ? 0 : size.hashCode())) * 31) + this.read.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Complex(RemoteActionCompatParcelizer=");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(", AudioAttributesCompatParcelizer=");
                sb.append(this.AudioAttributesCompatParcelizer);
                sb.append(", write=");
                sb.append(this.write);
                sb.append(", read=");
                sb.append(this.read);
                sb.append(')');
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel p0, int p1) {
                toMagicModuleMetaRepoModel.write(p0, "");
                p0.writeString(this.RemoteActionCompatParcelizer);
                p0.writeStringList(this.AudioAttributesCompatParcelizer);
                p0.writeParcelable(this.write, p1);
                Map<String, String> map = this.read;
                p0.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    p0.writeString(entry.getKey());
                    p0.writeString(entry.getValue());
                }
            }
        }
    }
}
