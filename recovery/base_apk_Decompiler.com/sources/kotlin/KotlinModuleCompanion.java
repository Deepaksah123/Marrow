package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinKeySerializersKt;
import kotlin.KotlinSerializersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f"}, d2 = {"Lo/KotlinModuleCompanion;", "", "T", "<init>", "()V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write", "read", "Lo/KotlinModuleCompanion$AudioAttributesCompatParcelizer;", "Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;", "Lo/KotlinModuleCompanion$write;", "Lo/KotlinModuleCompanion$read;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KotlinModuleCompanion<T> {
    private KotlinModuleCompanion() {
    }

    public /* synthetic */ KotlinModuleCompanion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017"}, d2 = {"Lo/KotlinModuleCompanion$read;", "", "T", "Lo/KotlinModuleCompanion;", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "read", "Ljava/util/List;", "write", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "Lo/KotlinKeySerializers;", "IconCompatParcelizer", "Lo/KotlinKeySerializers;", "()Lo/KotlinKeySerializers;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class read<T> extends KotlinModuleCompanion<T> {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final KotlinKeySerializers read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final List<T> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final KotlinKeySerializers AudioAttributesCompatParcelizer;

        public final List<T> write() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final KotlinKeySerializers getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final KotlinKeySerializers getRead() {
            return this.read;
        }

        public final String toString() {
            KotlinKeySerializers kotlinKeySerializers = this.read;
            StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
            sb.append(this.RemoteActionCompatParcelizer.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) this.RemoteActionCompatParcelizer));
            sb.append("\n                    |   last item: ");
            sb.append(IntermediateLoginResponseBody.MediaMetadataCompat((List) this.RemoteActionCompatParcelizer));
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("\n                    ");
            String string = sb.toString();
            if (kotlinKeySerializers != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(kotlinKeySerializers);
                sb2.append('\n');
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("|)");
            return TestGroupLSModel.RemoteActionCompatParcelizer(sb3.toString(), "|");
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, readVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, readVar.read);
        }

        public final int hashCode() {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            KotlinKeySerializers kotlinKeySerializers = this.AudioAttributesCompatParcelizer;
            int iHashCode2 = kotlinKeySerializers == null ? 0 : kotlinKeySerializers.hashCode();
            KotlinKeySerializers kotlinKeySerializers2 = this.read;
            return (((iHashCode * 31) + iHashCode2) * 31) + (kotlinKeySerializers2 != null ? kotlinKeySerializers2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 5*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00015BG\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003J;\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(JK\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u0003\"\b\b\u0002\u0010**\u00020\u00022(\u0010+\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0,0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\t\u0010-\u001a\u00020\nHÖ\u0001JE\u0010.\u001a\b\u0012\u0004\u0012\u0002H*0\u0003\"\b\b\u0002\u0010**\u00020\u00022\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J9\u0010/\u001a\b\u0012\u0004\u0012\u0002H*0\u0000\"\b\b\u0002\u0010**\u00020\u00022\u001e\u0010+\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\b00H\u0082\bJ\b\u00101\u001a\u000202H\u0016JM\u00103\u001a\b\u0012\u0004\u0012\u0002H*0\u0000\"\b\b\u0002\u0010**\u00020\u00022*\u0010+\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\b0\u000700H\u0080\bø\u0001\u0001¢\u0006\u0002\b4R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "T", "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersBefore", "", "placeholdersAfter", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMediatorLoadStates", "()Landroidx/paging/LoadStates;", "getPages", "()Ljava/util/List;", "getPlaceholdersAfter", "()I", "getPlaceholdersBefore", "getSourceLoadStates", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "hashCode", "map", "mapPages", "Lkotlin/Function1;", "toString", "", "transformPages", "transformPages$paging_common", "Companion", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer<T> extends KotlinModuleCompanion<T> {
        private static final RemoteActionCompatParcelizer<Object> RemoteActionCompatParcelizer;
        public static final IconCompatParcelizer write = new IconCompatParcelizer(null);
        private final accessgetStaticJsonKeyGetter AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final KotlinKeySerializers IconCompatParcelizer;
        private final KotlinKeySerializers MediaBrowserCompatCustomActionResultReceiver;
        private final List<KotlinSerializersKt<T>> read;

        /* JADX INFO: renamed from: read, reason: from getter */
        public final accessgetStaticJsonKeyGetter getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final List<KotlinSerializersKt<T>> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final int getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final KotlinKeySerializers getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final KotlinKeySerializers getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        private RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, List<KotlinSerializersKt<T>> list, int i, int i2, KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2) {
            super(null);
            this.AudioAttributesCompatParcelizer = accessgetstaticjsonkeygetter;
            this.read = list;
            this.AudioAttributesImplApi26Parcelizer = i;
            this.AudioAttributesImplBaseParcelizer = i2;
            this.MediaBrowserCompatCustomActionResultReceiver = kotlinKeySerializers;
            this.IconCompatParcelizer = kotlinKeySerializers2;
            if (accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.APPEND && i < 0) {
                throw new IllegalArgumentException("Prepend insert defining placeholdersBefore must be > 0, but was ".concat(String.valueOf(i)).toString());
            }
            if (accessgetstaticjsonkeygetter != accessgetStaticJsonKeyGetter.PREPEND && i2 < 0) {
                throw new IllegalArgumentException("Append insert defining placeholdersAfter must be > 0, but was ".concat(String.valueOf(i2)).toString());
            }
            if (accessgetstaticjsonkeygetter == accessgetStaticJsonKeyGetter.REFRESH && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJF\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJN\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "()V", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;", "Append", "T", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "Prepend", "placeholdersBefore", "Refresh", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class IconCompatParcelizer {
            private IconCompatParcelizer() {
            }

            public static /* synthetic */ RemoteActionCompatParcelizer read(List list, KotlinKeySerializers kotlinKeySerializers) {
                return read(list, 0, 0, kotlinKeySerializers, null);
            }

            public static <T> RemoteActionCompatParcelizer<T> read(List<KotlinSerializersKt<T>> list, int i, int i2, KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2) {
                toMagicModuleMetaRepoModel.write(list, "");
                toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
                return new RemoteActionCompatParcelizer<>(accessgetStaticJsonKeyGetter.REFRESH, list, i, i2, kotlinKeySerializers, kotlinKeySerializers2, null);
            }

            public static <T> RemoteActionCompatParcelizer<T> AudioAttributesCompatParcelizer(List<KotlinSerializersKt<T>> list, int i, KotlinKeySerializers kotlinKeySerializers) {
                toMagicModuleMetaRepoModel.write(list, "");
                toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
                return new RemoteActionCompatParcelizer<>(accessgetStaticJsonKeyGetter.PREPEND, list, i, -1, kotlinKeySerializers, null, null);
            }

            public static <T> RemoteActionCompatParcelizer<T> RemoteActionCompatParcelizer(List<KotlinSerializersKt<T>> list, int i, KotlinKeySerializers kotlinKeySerializers) {
                toMagicModuleMetaRepoModel.write(list, "");
                toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
                return new RemoteActionCompatParcelizer<>(accessgetStaticJsonKeyGetter.APPEND, list, -1, i, kotlinKeySerializers, null, null);
            }

            public static RemoteActionCompatParcelizer<Object> read() {
                return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            }

            public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        static {
            KotlinSerializersKt.Companion companion = KotlinSerializersKt.INSTANCE;
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(KotlinSerializersKt.Companion.IconCompatParcelizer());
            KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion2 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
            KotlinKeySerializersKt.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write();
            KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion3 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
            KotlinKeySerializersKt.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.IconCompatParcelizer();
            KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion4 = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
            RemoteActionCompatParcelizer = IconCompatParcelizer.read(listRemoteActionCompatParcelizer, new KotlinKeySerializers(remoteActionCompatParcelizerWrite, remoteActionCompatParcelizerIconCompatParcelizer, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.IconCompatParcelizer()));
        }

        public final String toString() {
            List<T> listAudioAttributesCompatParcelizer;
            List<T> listAudioAttributesCompatParcelizer2;
            Iterator<T> it = this.read.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((KotlinSerializersKt) it.next()).AudioAttributesCompatParcelizer().size();
            }
            int i = this.AudioAttributesImplApi26Parcelizer;
            String strValueOf = i != -1 ? String.valueOf(i) : "none";
            int i2 = this.AudioAttributesImplBaseParcelizer;
            String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
            KotlinKeySerializers kotlinKeySerializers = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            KotlinSerializersKt kotlinSerializersKt = (KotlinSerializersKt) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) this.read);
            Object objMediaMetadataCompat = null;
            sb.append((kotlinSerializersKt == null || (listAudioAttributesCompatParcelizer2 = kotlinSerializersKt.AudioAttributesCompatParcelizer()) == null) ? null : IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listAudioAttributesCompatParcelizer2));
            sb.append("\n                    |   last item: ");
            KotlinSerializersKt kotlinSerializersKt2 = (KotlinSerializersKt) IntermediateLoginResponseBody.MediaMetadataCompat((List) this.read);
            if (kotlinSerializersKt2 != null && (listAudioAttributesCompatParcelizer = kotlinSerializersKt2.AudioAttributesCompatParcelizer()) != null) {
                objMediaMetadataCompat = IntermediateLoginResponseBody.MediaMetadataCompat((List<? extends Object>) listAudioAttributesCompatParcelizer);
            }
            sb.append(objMediaMetadataCompat);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append("\n                    ");
            String string = sb.toString();
            if (kotlinKeySerializers != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(kotlinKeySerializers);
                sb2.append('\n');
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("|)");
            return TestGroupLSModel.RemoteActionCompatParcelizer(sb3.toString(), "|");
        }

        public /* synthetic */ RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, List list, int i, int i2, KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(accessgetstaticjsonkeygetter, list, i, i2, kotlinKeySerializers, kotlinKeySerializers2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static RemoteActionCompatParcelizer<T> read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, List<KotlinSerializersKt<T>> list, int i, int i2, KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2) {
            toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
            return new RemoteActionCompatParcelizer<>(accessgetstaticjsonkeygetter, list, i, i2, kotlinKeySerializers, kotlinKeySerializers2);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) other;
            return this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, remoteActionCompatParcelizer.read) && this.AudioAttributesImplApi26Parcelizer == remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplBaseParcelizer == remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer);
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            int iHashCode2 = this.read.hashCode();
            int iHashCode3 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
            int iHashCode4 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
            int iHashCode5 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
            KotlinKeySerializers kotlinKeySerializers = this.IconCompatParcelizer;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (kotlinKeySerializers == null ? 0 : kotlinKeySerializers.hashCode());
        }
    }

    public static final class AudioAttributesCompatParcelizer<T> extends KotlinModuleCompanion<T> {
        private final int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final int read;
        private final accessgetStaticJsonKeyGetter write;

        public final /* synthetic */ class IconCompatParcelizer {
            public static final /* synthetic */ int[] read;

            static {
                int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
                try {
                    iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                read = iArr;
            }
        }

        public final accessgetStaticJsonKeyGetter AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int write() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, int i, int i2, int i3) {
            super(null);
            toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
            this.write = accessgetstaticjsonkeygetter;
            this.read = i;
            this.IconCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = i3;
            if (accessgetstaticjsonkeygetter == accessgetStaticJsonKeyGetter.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (read() > 0) {
                if (i3 < 0) {
                    throw new IllegalArgumentException("Invalid placeholdersRemaining ".concat(String.valueOf(i3)).toString());
                }
            } else {
                StringBuilder sb = new StringBuilder("Drop count must be > 0, but was ");
                sb.append(read());
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }

        public final int read() {
            return (this.IconCompatParcelizer - this.read) + 1;
        }

        public final String toString() {
            String str;
            int i = IconCompatParcelizer.read[this.write.ordinal()];
            if (i == 1) {
                str = TtmlNode.END;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            StringBuilder sb = new StringBuilder("PageEvent.Drop from the ");
            sb.append(str);
            sb.append(" (\n                    |   minPageOffset: ");
            sb.append(this.read);
            sb.append("\n                    |   maxPageOffset: ");
            sb.append(this.IconCompatParcelizer);
            sb.append("\n                    |   placeholdersRemaining: ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("\n                    |)");
            return TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.write == audioAttributesCompatParcelizer.write && this.read == audioAttributesCompatParcelizer.read && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (((((this.write.hashCode() * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015"}, d2 = {"Lo/KotlinModuleCompanion$write;", "", "T", "Lo/KotlinModuleCompanion;", "Lo/KotlinKeySerializers;", "p0", "p1", "<init>", "(Lo/KotlinKeySerializers;Lo/KotlinKeySerializers;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/KotlinKeySerializers;", "AudioAttributesCompatParcelizer", "()Lo/KotlinKeySerializers;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class write<T> extends KotlinModuleCompanion<T> {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final KotlinKeySerializers RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final KotlinKeySerializers AudioAttributesCompatParcelizer;

        public /* synthetic */ write(KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(kotlinKeySerializers, (i & 2) != 0 ? null : kotlinKeySerializers2);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final KotlinKeySerializers getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final KotlinKeySerializers getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(KotlinKeySerializers kotlinKeySerializers, KotlinKeySerializers kotlinKeySerializers2) {
            super(null);
            toMagicModuleMetaRepoModel.write(kotlinKeySerializers, "");
            this.AudioAttributesCompatParcelizer = kotlinKeySerializers;
            this.RemoteActionCompatParcelizer = kotlinKeySerializers2;
        }

        public final String toString() {
            KotlinKeySerializers kotlinKeySerializers = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("\n                    ");
            String string = sb.toString();
            if (kotlinKeySerializers != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("|   mediatorLoadStates: ");
                sb2.append(kotlinKeySerializers);
                sb2.append('\n');
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("|)");
            return TestGroupLSModel.RemoteActionCompatParcelizer(sb3.toString(), "|");
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, writeVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            KotlinKeySerializers kotlinKeySerializers = this.RemoteActionCompatParcelizer;
            return (iHashCode * 31) + (kotlinKeySerializers == null ? 0 : kotlinKeySerializers.hashCode());
        }
    }
}
