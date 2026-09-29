package kotlin;

import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u000b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/_deserializeFromObjectId;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "<init>", "()V", "Lo/_addExplicitAnyCreator;", "write", "()Lo/_addExplicitAnyCreator;", "RemoteActionCompatParcelizer", "Lo/deserializeFromEmbedded;", "read", "()Lo/deserializeFromEmbedded;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class _deserializeFromObjectId implements AbstractDeserializer.RemoteActionCompatParcelizer {
    /* JADX INFO: renamed from: read */
    public abstract deserializeFromEmbedded getRead();

    /* JADX INFO: renamed from: write */
    public abstract _addExplicitAnyCreator getAudioAttributesCompatParcelizer();

    private _deserializeFromObjectId() {
    }

    public /* synthetic */ _deserializeFromObjectId(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/_deserializeFromObjectId$IconCompatParcelizer;", "Lo/_deserializeFromObjectId;", "", "p0", "Lo/deserializeFromEmbedded;", "p1", "Lo/_addExplicitAnyCreator;", "p2", "<init>", "(Ljava/lang/String;Lo/deserializeFromEmbedded;Lo/_addExplicitAnyCreator;)V", "read", "(Ljava/lang/String;Lo/deserializeFromEmbedded;Lo/_addExplicitAnyCreator;)Lo/_deserializeFromObjectId$IconCompatParcelizer;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/deserializeFromEmbedded;", "()Lo/deserializeFromEmbedded;", "Lo/_addExplicitAnyCreator;", "write", "()Lo/_addExplicitAnyCreator;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends _deserializeFromObjectId {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final deserializeFromEmbedded read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final _addExplicitAnyCreator IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        public IconCompatParcelizer(String str, deserializeFromEmbedded deserializefromembedded, _addExplicitAnyCreator _addexplicitanycreator) {
            super(null);
            this.RemoteActionCompatParcelizer = str;
            this.read = deserializefromembedded;
            this.IconCompatParcelizer = _addexplicitanycreator;
        }

        public /* synthetic */ IconCompatParcelizer(String str, deserializeFromEmbedded deserializefromembedded, _addExplicitAnyCreator _addexplicitanycreator, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, (i & 2) != 0 ? null : deserializefromembedded, (i & 4) != 0 ? null : _addexplicitanycreator);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin._deserializeFromObjectId
        /* JADX INFO: renamed from: read, reason: from getter */
        public final deserializeFromEmbedded getRead() {
            return this.read;
        }

        @Override // kotlin._deserializeFromObjectId
        /* JADX INFO: renamed from: write, reason: from getter */
        public final _addExplicitAnyCreator getAudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public static /* synthetic */ IconCompatParcelizer read$default(IconCompatParcelizer iconCompatParcelizer, String str, deserializeFromEmbedded deserializefromembedded, _addExplicitAnyCreator _addexplicitanycreator, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iconCompatParcelizer.RemoteActionCompatParcelizer;
            }
            if ((i & 2) != 0) {
                deserializefromembedded = iconCompatParcelizer.getRead();
            }
            if ((i & 4) != 0) {
                _addexplicitanycreator = iconCompatParcelizer.getAudioAttributesCompatParcelizer();
            }
            return iconCompatParcelizer.read(str, deserializefromembedded, _addexplicitanycreator);
        }

        public final IconCompatParcelizer read(String p0, deserializeFromEmbedded p1, _addExplicitAnyCreator p2) {
            return new IconCompatParcelizer(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getRead(), iconCompatParcelizer.getRead()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer(), iconCompatParcelizer.getAudioAttributesCompatParcelizer());
        }

        public final int hashCode() {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            deserializeFromEmbedded read = getRead();
            int iHashCode2 = read != null ? read.hashCode() : 0;
            _addExplicitAnyCreator audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer();
            return (((iHashCode * 31) + iHashCode2) * 31) + (audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkAnnotation.Url(url=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\n\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c"}, d2 = {"Lo/_deserializeFromObjectId$read;", "Lo/_deserializeFromObjectId;", "", "p0", "Lo/deserializeFromEmbedded;", "p1", "Lo/_addExplicitAnyCreator;", "p2", "<init>", "(Ljava/lang/String;Lo/deserializeFromEmbedded;Lo/_addExplicitAnyCreator;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/deserializeFromEmbedded;Lo/_addExplicitAnyCreator;)Lo/_deserializeFromObjectId$read;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "Lo/deserializeFromEmbedded;", "()Lo/deserializeFromEmbedded;", "write", "Lo/_addExplicitAnyCreator;", "()Lo/_addExplicitAnyCreator;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends _deserializeFromObjectId {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final deserializeFromEmbedded read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final _addExplicitAnyCreator AudioAttributesCompatParcelizer;

        public read(String str, deserializeFromEmbedded deserializefromembedded, _addExplicitAnyCreator _addexplicitanycreator) {
            super(null);
            this.IconCompatParcelizer = str;
            this.read = deserializefromembedded;
            this.AudioAttributesCompatParcelizer = _addexplicitanycreator;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin._deserializeFromObjectId
        /* JADX INFO: renamed from: read, reason: from getter */
        public final deserializeFromEmbedded getRead() {
            return this.read;
        }

        @Override // kotlin._deserializeFromObjectId
        /* JADX INFO: renamed from: write, reason: from getter */
        public final _addExplicitAnyCreator getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public static /* synthetic */ read RemoteActionCompatParcelizer$default(read readVar, String str, deserializeFromEmbedded deserializefromembedded, _addExplicitAnyCreator _addexplicitanycreator, int i, Object obj) {
            if ((i & 1) != 0) {
                str = readVar.IconCompatParcelizer;
            }
            if ((i & 2) != 0) {
                deserializefromembedded = readVar.getRead();
            }
            if ((i & 4) != 0) {
                _addexplicitanycreator = readVar.getAudioAttributesCompatParcelizer();
            }
            return readVar.RemoteActionCompatParcelizer(str, deserializefromembedded, _addexplicitanycreator);
        }

        public final read RemoteActionCompatParcelizer(String p0, deserializeFromEmbedded p1, _addExplicitAnyCreator p2) {
            return new read(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getRead(), readVar.getRead()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer(), readVar.getAudioAttributesCompatParcelizer());
        }

        public final int hashCode() {
            int iHashCode = this.IconCompatParcelizer.hashCode();
            deserializeFromEmbedded read = getRead();
            int iHashCode2 = read != null ? read.hashCode() : 0;
            _addExplicitAnyCreator audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer();
            return (((iHashCode * 31) + iHashCode2) * 31) + (audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkAnnotation.Clickable(tag=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
