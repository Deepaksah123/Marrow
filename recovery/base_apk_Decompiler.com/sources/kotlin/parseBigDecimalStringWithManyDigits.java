package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.JavaBigIntegerFromCharSequence;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0013R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R2\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f0\u0019\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Lo/parseBigDecimalStringWithManyDigits;", "Lo/JavaBigIntegerFromCharSequence;", "", "", "", "", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Ljava/util/Map;Lo/getAnswerMap;)V", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Z", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "Lo/JavaBigIntegerFromCharSequence$read;", "read", "(Ljava/lang/String;Lo/getCreatedOnDateMs;)Lo/JavaBigIntegerFromCharSequence$read;", "()Ljava/util/Map;", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "Lo/setKeyListener;", "IconCompatParcelizer", "Lo/setKeyListener;", "", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class parseBigDecimalStringWithManyDigits implements JavaBigIntegerFromCharSequence {
    private final setKeyListener<String, List<Object>> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Object, Boolean> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setKeyListener<String, List<getCreatedOnDateMs<Object>>> RemoteActionCompatParcelizer;

    public parseBigDecimalStringWithManyDigits(Map<String, ? extends List<? extends Object>> map, getAnswerMap<Object, Boolean> getanswermap) {
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.IconCompatParcelizer = (map == null || map.isEmpty()) ? null : parseBigIntegerLiteral.read(map);
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final boolean AudioAttributesCompatParcelizer(Object p0) {
        return this.AudioAttributesCompatParcelizer.invoke(p0).booleanValue();
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final Object AudioAttributesCompatParcelizer(String p0) {
        setKeyListener<String, List<Object>> setkeylistener;
        setKeyListener<String, List<Object>> setkeylistener2 = this.IconCompatParcelizer;
        List<Object> listIconCompatParcelizer = setkeylistener2 != null ? setkeylistener2.IconCompatParcelizer(p0) : null;
        List<Object> list = listIconCompatParcelizer;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listIconCompatParcelizer.size() > 1 && (setkeylistener = this.IconCompatParcelizer) != null) {
            setkeylistener.AudioAttributesCompatParcelizer(p0, listIconCompatParcelizer.subList(1, listIconCompatParcelizer.size()));
        }
        return listIconCompatParcelizer.get(0);
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final JavaBigIntegerFromCharSequence.read read(String p0, getCreatedOnDateMs<? extends Object> p1) {
        if (parseBigIntegerLiteral.write(p0)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        setKeyListener<String, List<getCreatedOnDateMs<Object>>> setkeylistener = this.RemoteActionCompatParcelizer;
        if (setkeylistener == null) {
            setkeylistener = setAutoSizeTextTypeUniformWithPresetSizes.read();
            this.RemoteActionCompatParcelizer = setkeylistener;
        }
        ArrayList arrayListAudioAttributesImplApi26Parcelizer = setkeylistener.AudioAttributesImplApi26Parcelizer(p0);
        if (arrayListAudioAttributesImplApi26Parcelizer == null) {
            arrayListAudioAttributesImplApi26Parcelizer = new ArrayList();
            setkeylistener.RemoteActionCompatParcelizer(p0, arrayListAudioAttributesImplApi26Parcelizer);
        }
        arrayListAudioAttributesImplApi26Parcelizer.add(p1);
        return new RemoteActionCompatParcelizer(setkeylistener, p0, p1);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/parseBigDecimalStringWithManyDigits$RemoteActionCompatParcelizer;", "Lo/JavaBigIntegerFromCharSequence$read;", "", "RemoteActionCompatParcelizer", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements JavaBigIntegerFromCharSequence.read {
        final /* synthetic */ setKeyListener<String, List<getCreatedOnDateMs<Object>>> AudioAttributesCompatParcelizer;
        final /* synthetic */ String RemoteActionCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<Object> write;

        RemoteActionCompatParcelizer(setKeyListener<String, List<getCreatedOnDateMs<Object>>> setkeylistener, String str, getCreatedOnDateMs<? extends Object> getcreatedondatems) {
            this.AudioAttributesCompatParcelizer = setkeylistener;
            this.RemoteActionCompatParcelizer = str;
            this.write = getcreatedondatems;
        }

        @Override // o.JavaBigIntegerFromCharSequence.read
        public final void RemoteActionCompatParcelizer() {
            List<getCreatedOnDateMs<Object>> listIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            if (listIconCompatParcelizer != null) {
                listIconCompatParcelizer.remove(this.write);
            }
            List<getCreatedOnDateMs<Object>> list = listIconCompatParcelizer;
            if (list == null || list.isEmpty()) {
                return;
            }
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, listIconCompatParcelizer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // kotlin.JavaBigIntegerFromCharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> read() {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseBigDecimalStringWithManyDigits.read():java.util.Map");
    }
}
