package kotlin;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._handleApos;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\b\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u000e*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016"}, d2 = {"Landroid/view/View;", "p0", "Lo/PieChart;", "p1", "Lo/getUnknownTypeSerializer;", "RemoteActionCompatParcelizer", "(Landroid/view/View;Lo/PieChart;)Lo/getUnknownTypeSerializer;", "", "write", "(Ljava/lang/String;Lo/PieChart;)Lo/getUnknownTypeSerializer;", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "(Landroid/os/Bundle;)Ljava/util/Map;", "read", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "[Ljava/lang/Class;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class mappingException {
    private static final Class<? extends Object>[] read = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final getUnknownTypeSerializer RemoteActionCompatParcelizer(View view, PieChart pieChart) {
        Object parent = view.getParent();
        toMagicModuleMetaRepoModel.read(parent, "");
        View view2 = (View) parent;
        Object tag = view2.getTag(_handleApos.AudioAttributesCompatParcelizer.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return write(strValueOf, pieChart);
    }

    public static final getUnknownTypeSerializer write(String str, PieChart pieChart) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(JavaBigIntegerFromCharSequence.class.getSimpleName());
        sb.append(':');
        sb.append(str);
        String string = sb.toString();
        setOnChartValueSelectedListener savedStateRegistry = pieChart.getSavedStateRegistry();
        Bundle bundleRemoteActionCompatParcelizer = savedStateRegistry.RemoteActionCompatParcelizer(string);
        final JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequenceAudioAttributesCompatParcelizer = parseBigIntegerLiteral.AudioAttributesCompatParcelizer(bundleRemoteActionCompatParcelizer != null ? write(bundleRemoteActionCompatParcelizer) : null, AnonymousClass1.AudioAttributesCompatParcelizer);
        try {
            savedStateRegistry.IconCompatParcelizer(string, new setOnChartValueSelectedListener.AudioAttributesCompatParcelizer() { // from class: o.reportMappingProblem
                @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
                public final Bundle read() {
                    return mappingException.AudioAttributesCompatParcelizer(javaBigIntegerFromCharSequenceAudioAttributesCompatParcelizer);
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new getUnknownTypeSerializer(javaBigIntegerFromCharSequenceAudioAttributesCompatParcelizer, new AnonymousClass5(z, savedStateRegistry, string));
    }

    /* JADX INFO: renamed from: o.mappingException$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass1 AudioAttributesCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(mappingException.AudioAttributesCompatParcelizer(obj));
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle AudioAttributesCompatParcelizer(JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence) {
        return read((Map<String, ? extends List<? extends Object>>) javaBigIntegerFromCharSequence.read());
    }

    /* JADX INFO: renamed from: o.mappingException$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ boolean $AudioAttributesCompatParcelizer;
        final /* synthetic */ setOnChartValueSelectedListener $RemoteActionCompatParcelizer;
        final /* synthetic */ String $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer() {
            if (this.$AudioAttributesCompatParcelizer) {
                this.$RemoteActionCompatParcelizer.read(this.$write);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(boolean z, setOnChartValueSelectedListener setonchartvalueselectedlistener, String str) {
            super(0);
            this.$AudioAttributesCompatParcelizer = z;
            this.$RemoteActionCompatParcelizer = setonchartvalueselectedlistener;
            this.$write = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof toDecimalString) {
            toDecimalString todecimalstring = (toDecimalString) obj;
            if (todecimalstring.n_() != _qbuf.AudioAttributesCompatParcelizer() && todecimalstring.n_() != _qbuf.RemoteActionCompatParcelizer() && todecimalstring.n_() != _qbuf.read()) {
                return false;
            }
            T t = todecimalstring.getRemoteActionCompatParcelizer();
            if (t == 0) {
                return true;
            }
            return AudioAttributesCompatParcelizer(t);
        }
        if ((obj instanceof setRenewGrpId) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : read) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Map<String, List<Object>> write(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            toMagicModuleMetaRepoModel.read(parcelableArrayList, "");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    private static final Bundle read(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }
}
