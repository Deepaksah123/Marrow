package kotlin;

import android.os.Process;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/addConnectionCallbacks;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "Lo/addConnectionCallbacks$RemoteActionCompatParcelizer;", "Lo/addConnectionCallbacks$write;", "Lo/addConnectionCallbacks$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class addConnectionCallbacks {

    public static final class RemoteActionCompatParcelizer extends addConnectionCallbacks {
        private final int IconCompatParcelizer;
        private final boolean write;

        public RemoteActionCompatParcelizer(int i, boolean z) {
            super(null);
            this.IconCompatParcelizer = i;
            this.write = z;
        }

        public final boolean read() {
            return this.write;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer && this.write == remoteActionCompatParcelizer.write;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.IconCompatParcelizer) * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("Default(completedModule=");
            sb.append(i);
            sb.append(", isProVisible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    private addConnectionCallbacks() {
    }

    public static final class write extends addConnectionCallbacks {
        public static int AudioAttributesCompatParcelizer;
        public static int IconCompatParcelizer;
        private final IconCompatParcelizer RemoteActionCompatParcelizer;
        private final boolean read;
        private final RemoteActionCompatParcelizer write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, IconCompatParcelizer iconCompatParcelizer) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.write = remoteActionCompatParcelizer;
            this.read = z;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final IconCompatParcelizer write() {
            return this.RemoteActionCompatParcelizer;
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lo/addConnectionCallbacks$write$RemoteActionCompatParcelizer;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "Lo/addConnectionCallbacks$write$RemoteActionCompatParcelizer$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class RemoteActionCompatParcelizer {

            public static final class AudioAttributesCompatParcelizer extends RemoteActionCompatParcelizer {
                private final int IconCompatParcelizer;
                private final String read;
                private final int write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AudioAttributesCompatParcelizer(int i, int i2, String str) {
                    super(null);
                    toMagicModuleMetaRepoModel.write(str, "");
                    this.write = i;
                    this.IconCompatParcelizer = i2;
                    this.read = str;
                }

                public final int AudioAttributesCompatParcelizer() {
                    return this.write;
                }

                public final int write() {
                    return this.IconCompatParcelizer;
                }

                public final String IconCompatParcelizer() {
                    return this.read;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                        return false;
                    }
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
                    return this.write == audioAttributesCompatParcelizer.write && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesCompatParcelizer.read);
                }

                public final int hashCode() {
                    return (((Integer.hashCode(this.write) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.read.hashCode();
                }

                public final String toString() {
                    int i = this.write;
                    int i2 = this.IconCompatParcelizer;
                    String str = this.read;
                    StringBuilder sb = new StringBuilder("ModuleCounterBottom(completedModule=");
                    sb.append(i);
                    sb.append(", totalModule=");
                    sb.append(i2);
                    sb.append(", text=");
                    sb.append(str);
                    sb.append(")");
                    return sb.toString();
                }
            }

            private RemoteActionCompatParcelizer() {
            }

            public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, writeVar.write) && this.read == writeVar.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
            return ((((remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
            boolean z = this.read;
            IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Dynamic(zenAreaFooter=");
            sb.append(remoteActionCompatParcelizer);
            sb.append(", isCtaVisible=");
            sb.append(z);
            sb.append(", ctaText=");
            sb.append(iconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public static int IconCompatParcelizer() {
            int i = IconCompatParcelizer;
            int i2 = i % 8339084;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iMyPid = Process.myPid();
            AudioAttributesCompatParcelizer = iMyPid;
            return iMyPid;
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lo/addConnectionCallbacks$write$IconCompatParcelizer;", "", "<init>", "()V", "read", "Lo/addConnectionCallbacks$write$IconCompatParcelizer$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class IconCompatParcelizer {

            public static final class read extends IconCompatParcelizer {
                private final String RemoteActionCompatParcelizer;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public read(String str) {
                    super(null);
                    toMagicModuleMetaRepoModel.write(str, "");
                    this.RemoteActionCompatParcelizer = str;
                }

                public final String write() {
                    return this.RemoteActionCompatParcelizer;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ((read) obj).RemoteActionCompatParcelizer);
                }

                public final int hashCode() {
                    return this.RemoteActionCompatParcelizer.hashCode();
                }

                public final String toString() {
                    String str = this.RemoteActionCompatParcelizer;
                    StringBuilder sb = new StringBuilder("DefaultCta(text=");
                    sb.append(str);
                    sb.append(")");
                    return sb.toString();
                }
            }

            private IconCompatParcelizer() {
            }

            public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    public /* synthetic */ addConnectionCallbacks(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesCompatParcelizer extends addConnectionCallbacks {
        private final boolean RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == ((AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("NewCourseArt(isWaterRippleEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }
}
