package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001a\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/NoOpControllerHelper;", "Lo/assertNotBuildingModels;", "Lo/hasValueTypeDeserializer;", "p0", "Lo/SettableBeanProperty;", "p1", "Lo/hasStableIds;", "p2", "Lo/setFontAssetDelegate;", "p3", "<init>", "(Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/hasStableIds;Lo/setFontAssetDelegate;)V", "Lkotlin/Function1;", "Lo/findBeanDeserializer;", "", "write", "(Lo/getAnswerMap;)Ljava/util/List;", "onSeekTo", "()Lo/NoOpControllerHelper;", "onPrepareFromUri", "", "RemoteActionCompatParcelizer", "(Lo/hasStableIds;I)I", "read", "Lo/hasValueTypeDeserializer;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/hasStableIds;", "onPrepareFromMediaId", "()Lo/hasValueTypeDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoOpControllerHelper extends assertNotBuildingModels<NoOpControllerHelper> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final hasStableIds RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final hasValueTypeDeserializer IconCompatParcelizer;

    public NoOpControllerHelper(hasValueTypeDeserializer hasvaluetypedeserializer, SettableBeanProperty settableBeanProperty, hasStableIds hasstableids, setFontAssetDelegate setfontassetdelegate) {
        super(hasvaluetypedeserializer.getRead(), hasvaluetypedeserializer.getAudioAttributesCompatParcelizer(), hasstableids != null ? hasstableids.getAudioAttributesCompatParcelizer() : null, settableBeanProperty, setfontassetdelegate, null);
        this.IconCompatParcelizer = hasvaluetypedeserializer;
        this.RemoteActionCompatParcelizer = hasstableids;
    }

    public final hasValueTypeDeserializer onPrepareFromMediaId() {
        return hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(this.IconCompatParcelizer, getAudioAttributesImplBaseParcelizer(), getAudioAttributesImplApi26Parcelizer(), null, 4, null);
    }

    public final List<findBeanDeserializer> write(getAnswerMap<? super NoOpControllerHelper, ? extends findBeanDeserializer> p0) {
        if (!findProperty.write(getAudioAttributesImplApi26Parcelizer())) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new findBeanDeserializer[]{new Deserializers("", 0), new hasViews(findProperty.MediaBrowserCompatCustomActionResultReceiver(getAudioAttributesImplApi26Parcelizer()), findProperty.MediaBrowserCompatCustomActionResultReceiver(getAudioAttributesImplApi26Parcelizer()))});
        }
        findBeanDeserializer findbeandeserializerInvoke = p0.invoke(this);
        if (findbeandeserializerInvoke != null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(findbeandeserializerInvoke);
        }
        return null;
    }

    public final NoOpControllerHelper onSeekTo() {
        hasStableIds hasstableids;
        NoOpControllerHelper noOpControllerHelper = this;
        if (noOpControllerHelper.RatingCompat().length() > 0 && (hasstableids = this.RemoteActionCompatParcelizer) != null) {
            RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(hasstableids, -1));
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return noOpControllerHelper;
    }

    public final NoOpControllerHelper onPrepareFromUri() {
        hasStableIds hasstableids;
        NoOpControllerHelper noOpControllerHelper = this;
        if (noOpControllerHelper.RatingCompat().length() > 0 && (hasstableids = this.RemoteActionCompatParcelizer) != null) {
            RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(hasstableids, 1));
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return noOpControllerHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int RemoteActionCompatParcelizer(kotlin.hasStableIds r11, int r12) {
        /*
            r10 = this;
            o.isAbstract r0 = r11.getRead()
            r1 = 0
            if (r0 == 0) goto L15
            o.isAbstract r2 = r11.getWrite()
            r3 = 0
            if (r2 == 0) goto L13
            r4 = 2
            o.WritableTypeIdInclusion r3 = kotlin.isAbstract.write$default(r2, r0, r1, r4, r3)
        L13:
            if (r3 != 0) goto L1b
        L15:
            o.WritableTypeIdInclusion$RemoteActionCompatParcelizer r0 = kotlin.WritableTypeIdInclusion.INSTANCE
            o.WritableTypeIdInclusion r3 = r0.write()
        L1b:
            o.SettableBeanProperty r0 = r10.getWrite()
            o.hasValueTypeDeserializer r2 = r10.IconCompatParcelizer
            long r4 = r2.getAudioAttributesCompatParcelizer()
            int r2 = kotlin.findProperty.read(r4)
            int r0 = r0.RemoteActionCompatParcelizer(r2)
            o.deserializeFromNumber r2 = r11.getAudioAttributesCompatParcelizer()
            o.WritableTypeIdInclusion r0 = r2.IconCompatParcelizer(r0)
            float r2 = r0.getAudioAttributesCompatParcelizer()
            float r0 = r0.getRemoteActionCompatParcelizer()
            long r3 = r3.MediaBrowserCompatItemReceiver()
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r12 = (float) r12
            o.SettableBeanProperty r10 = r10.getWrite()
            o.deserializeFromNumber r11 = r11.getAudioAttributesCompatParcelizer()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            float r3 = r3 * r12
            float r0 = r0 + r3
            int r12 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r12
            r12 = 32
            long r4 = r4 << r12
            long r0 = (long) r1
            long r0 = r0 << r12
            r6 = -1
            long r6 = (long) r6
            r8 = 63
            long r8 = r6 >> r8
            long r8 = r8 << r12
            long r6 = r6 - r8
            long r0 = r0 | r6
            long r0 = r0 & r2
            long r0 = r0 | r4
            long r0 = kotlin.getReferencedType.AudioAttributesCompatParcelizer(r0)
            int r11 = r11.AudioAttributesCompatParcelizer(r0)
            int r10 = r10.write(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NoOpControllerHelper.RemoteActionCompatParcelizer(o.hasStableIds, int):int");
    }
}
