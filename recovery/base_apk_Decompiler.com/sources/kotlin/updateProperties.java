package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin._parseDoublePrimitive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/DeserializerCache;", "Landroid/content/Context;", "p0", "Landroid/graphics/Typeface;", "write", "(Lo/DeserializerCache;Landroid/content/Context;)Landroid/graphics/Typeface;", "AudioAttributesCompatParcelizer", "(Lo/DeserializerCache;Landroid/content/Context;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class updateProperties {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface write(DeserializerCache deserializerCache, Context context) {
        Typeface typefaceIconCompatParcelizer = _parseDoublePrimitive.IconCompatParcelizer(context, deserializerCache.getRemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.write(typefaceIconCompatParcelizer);
        return typefaceIconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/updateProperties$write;", "Lo/_parseDoublePrimitive$IconCompatParcelizer;", "Landroid/graphics/Typeface;", "p0", "", "read", "(Landroid/graphics/Typeface;)V", "", "RemoteActionCompatParcelizer", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends _parseDoublePrimitive.IconCompatParcelizer {
        final /* synthetic */ setStateRank<Typeface> IconCompatParcelizer;
        final /* synthetic */ DeserializerCache RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        write(setStateRank<? super Typeface> setstaterank, DeserializerCache deserializerCache) {
            this.IconCompatParcelizer = setstaterank;
            this.RemoteActionCompatParcelizer = deserializerCache;
        }

        @Override // o._parseDoublePrimitive.IconCompatParcelizer
        /* JADX INFO: renamed from: read */
        public final void RemoteActionCompatParcelizer(Typeface p0) {
            setStateRank<Typeface> setstaterank = this.IconCompatParcelizer;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterank.resumeWith(C0177getRfBanners.read(p0));
        }

        @Override // o._parseDoublePrimitive.IconCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final void IconCompatParcelizer(int p0) {
            setStateRank<Typeface> setstaterank = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Unable to load font ");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(" (reason=");
            sb.append(p0);
            sb.append(')');
            setstaterank.write((Throwable) new IllegalStateException(sb.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(DeserializerCache deserializerCache, Context context, SampleVideos<? super Typeface> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        _parseDoublePrimitive.read(context, deserializerCache.getRemoteActionCompatParcelizer(), new write(setstatesolvedcount, deserializerCache), null);
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }
}
