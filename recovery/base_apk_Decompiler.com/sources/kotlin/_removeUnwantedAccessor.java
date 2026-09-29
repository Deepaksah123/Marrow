package kotlin;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _removeUnwantedAccessor {
    public void AudioAttributesCompatParcelizer(Object obj) {
    }

    public abstract void AudioAttributesCompatParcelizer(Object obj, View view);

    public abstract void AudioAttributesCompatParcelizer(Object obj, ArrayList<View> arrayList);

    public Object IconCompatParcelizer(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract Object IconCompatParcelizer(Object obj);

    public abstract void IconCompatParcelizer(Object obj, View view, ArrayList<View> arrayList);

    public abstract void IconCompatParcelizer(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void IconCompatParcelizer(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object RemoteActionCompatParcelizer(Object obj);

    public abstract Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3);

    public abstract void RemoteActionCompatParcelizer(Object obj, View view);

    public abstract Object read(Object obj, Object obj2, Object obj3);

    public abstract void read(Object obj, Rect rect);

    public abstract void read(Object obj, View view, ArrayList<View> arrayList);

    public abstract boolean read(Object obj);

    public abstract void write(ViewGroup viewGroup, Object obj);

    public void write(Object obj, float f) {
    }

    public void write(Object obj, Runnable runnable) {
    }

    public boolean write(Object obj) {
        return false;
    }

    protected void write(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r0[0], r0[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean IconCompatParcelizer() {
        FragmentManager.write(4);
        return false;
    }

    ArrayList<String> AudioAttributesCompatParcelizer(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(InvalidTypeIdException.onMediaButtonEvent(view));
            InvalidTypeIdException.RemoteActionCompatParcelizer(view, (String) null);
        }
        return arrayList2;
    }

    void read(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strOnMediaButtonEvent = InvalidTypeIdException.onMediaButtonEvent(view2);
            arrayList4.add(strOnMediaButtonEvent);
            if (strOnMediaButtonEvent != null) {
                InvalidTypeIdException.RemoteActionCompatParcelizer(view2, (String) null);
                String str = map.get(strOnMediaButtonEvent);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        InvalidTypeIdException.RemoteActionCompatParcelizer(arrayList2.get(i2), strOnMediaButtonEvent);
                        break;
                    }
                    i2++;
                }
            }
        }
        childArray.RemoteActionCompatParcelizer(view, new Runnable() { // from class: o._removeUnwantedAccessor.4
            @Override // java.lang.Runnable
            public final void run() {
                for (int i3 = 0; i3 < size; i3++) {
                    InvalidTypeIdException.RemoteActionCompatParcelizer((View) arrayList2.get(i3), (String) arrayList3.get(i3));
                    InvalidTypeIdException.RemoteActionCompatParcelizer((View) arrayList.get(i3), (String) arrayList4.get(i3));
                }
            }
        });
    }

    public void AudioAttributesCompatParcelizer(Fragment fragment, Object obj, _weirdKey _weirdkey, Runnable runnable) {
        IconCompatParcelizer(fragment, obj, _weirdkey, null, runnable);
    }

    public void IconCompatParcelizer(Fragment fragment, Object obj, _weirdKey _weirdkey, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    protected static void RemoteActionCompatParcelizer(List<View> list, View view) {
        int size = list.size();
        if (write(list, view, size)) {
            return;
        }
        if (InvalidTypeIdException.onMediaButtonEvent(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!write(list, childAt, size) && InvalidTypeIdException.onMediaButtonEvent(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean write(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean AudioAttributesCompatParcelizer(List list) {
        return list == null || list.isEmpty();
    }
}
