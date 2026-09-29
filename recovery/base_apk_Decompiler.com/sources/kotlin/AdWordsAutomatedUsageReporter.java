package kotlin;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.reportWithConversionId;

/* JADX INFO: loaded from: classes4.dex */
final class AdWordsAutomatedUsageReporter extends FrameLayout {
    private boolean IconCompatParcelizer;
    private ViewGroup read;

    AdWordsAutomatedUsageReporter(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.read = viewGroup;
        viewGroup.setTag(reportWithConversionId.RemoteActionCompatParcelizer.ghost_view_holder, this);
        InvalidTypeIdException.write(this.read, this);
        this.IconCompatParcelizer = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.IconCompatParcelizer) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.read.setTag(reportWithConversionId.RemoteActionCompatParcelizer.ghost_view_holder, null);
            this.read.getOverlay().remove(this);
            this.IconCompatParcelizer = false;
        }
    }

    static AdWordsAutomatedUsageReporter AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        return (AdWordsAutomatedUsageReporter) viewGroup.getTag(reportWithConversionId.RemoteActionCompatParcelizer.ghost_view_holder);
    }

    final void write() {
        if (!this.IconCompatParcelizer) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.read.getOverlay().remove(this);
        this.read.getOverlay().add(this);
    }

    final void read(enableAutomatedUsageReporting enableautomatedusagereporting) {
        ArrayList<View> arrayList = new ArrayList<>();
        AudioAttributesCompatParcelizer(enableautomatedusagereporting.AudioAttributesCompatParcelizer, arrayList);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(arrayList);
        if (iAudioAttributesCompatParcelizer < 0 || iAudioAttributesCompatParcelizer >= getChildCount()) {
            addView(enableautomatedusagereporting);
        } else {
            addView(enableautomatedusagereporting, iAudioAttributesCompatParcelizer);
        }
    }

    private int AudioAttributesCompatParcelizer(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            AudioAttributesCompatParcelizer(((enableAutomatedUsageReporting) getChildAt(i2)).AudioAttributesCompatParcelizer, arrayList2);
            if (IconCompatParcelizer(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    private static boolean IconCompatParcelizer(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < iMin; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return read(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    private static void AudioAttributesCompatParcelizer(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            AudioAttributesCompatParcelizer((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean read(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (AudioAttributesCompatParcelizer.IconCompatParcelizer(view) != AudioAttributesCompatParcelizer.IconCompatParcelizer(view2)) {
            return AudioAttributesCompatParcelizer.IconCompatParcelizer(view) > AudioAttributesCompatParcelizer.IconCompatParcelizer(view2);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(getPackageManager.AudioAttributesCompatParcelizer(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    static class AudioAttributesCompatParcelizer {
        static float IconCompatParcelizer(View view) {
            return view.getZ();
        }
    }
}
