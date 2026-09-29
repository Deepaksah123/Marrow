package kotlin;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.anyIgnorals;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f"}, d2 = {"Lo/setNoDataText;", "Lo/findAccess;", "Lo/PieChart;", "p0", "<init>", "(Lo/PieChart;)V", "Lo/hasGetter;", "Lo/anyIgnorals$read;", "p1", "", "read", "(Lo/hasGetter;Lo/anyIgnorals$read;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "Lo/PieChart;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setNoDataText implements findAccess {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final PieChart RemoteActionCompatParcelizer;

    public setNoDataText(PieChart pieChart) {
        toMagicModuleMetaRepoModel.write(pieChart, "");
        this.RemoteActionCompatParcelizer = pieChart;
    }

    @Override // kotlin.findAccess
    public final void read(hasGetter p0, anyIgnorals.read p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p1 != anyIgnorals.read.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        p0.getLifecycle().AudioAttributesCompatParcelizer(this);
        Bundle bundleRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.getSavedStateRegistry().RemoteActionCompatParcelizer("androidx.savedstate.Restarter");
        if (bundleRemoteActionCompatParcelizer != null) {
            List<String> listWrite = setUnbindEnabled.write(setUnbindEnabled.RemoteActionCompatParcelizer(bundleRemoteActionCompatParcelizer), "classes_to_restore");
            if (listWrite == null) {
                throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"".toString());
            }
            Iterator<String> it = listWrite.iterator();
            while (it.hasNext()) {
                AudioAttributesCompatParcelizer(it.next());
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(p0, false, setNoDataText.class.getClassLoader()).asSubclass(setOnChartValueSelectedListener.write.class);
            toMagicModuleMetaRepoModel.write(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    toMagicModuleMetaRepoModel.write(objNewInstance);
                    ((setOnChartValueSelectedListener.write) objNewInstance).IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(p0)), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb = new StringBuilder("Class ");
                sb.append(clsAsSubclass.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append(p0);
            sb2.append(" wasn't found");
            throw new RuntimeException(sb2.toString(), e3);
        }
    }

    public static final class write implements setOnChartValueSelectedListener.AudioAttributesCompatParcelizer {
        private final Set<String> IconCompatParcelizer;

        public write(setOnChartValueSelectedListener setonchartvalueselectedlistener) {
            toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener, "");
            this.IconCompatParcelizer = new LinkedHashSet();
            setonchartvalueselectedlistener.IconCompatParcelizer("androidx.savedstate.Restarter", this);
        }

        public final void AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer.add(str);
        }

        @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
        public final Bundle read() {
            Pair[] pairArr;
            Map map = VideoTimelineResponseBody.read();
            if (map.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(setAction.write((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleWrite = _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            setDrawOrder.read(setDrawOrder.AudioAttributesCompatParcelizer(bundleWrite), "classes_to_restore", IntermediateLoginResponseBody.onPlay(this.IconCompatParcelizer));
            return bundleWrite;
        }
    }
}
