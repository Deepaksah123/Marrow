package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin._weirdKey;

/* JADX INFO: loaded from: classes2.dex */
public class BubbleEntry extends _removeUnwantedAccessor {
    @Override // kotlin._removeUnwantedAccessor
    public boolean IconCompatParcelizer() {
        return true;
    }

    @Override // kotlin._removeUnwantedAccessor
    public boolean read(Object obj) {
        return obj instanceof Transition;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object IconCompatParcelizer(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.IconCompatParcelizer((Transition) obj);
        return transitionSet;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> listOnCustomAction = transitionSet.onCustomAction();
        listOnCustomAction.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(listOnCustomAction, arrayList.get(i));
        }
        listOnCustomAction.add(view);
        arrayList.add(view);
        AudioAttributesCompatParcelizer(transitionSet, arrayList);
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            write(view, rect);
            ((Transition) obj).read(new Transition.AudioAttributesCompatParcelizer() { // from class: o.BubbleEntry.3
                @Override // androidx.transition.Transition.AudioAttributesCompatParcelizer
                public final Rect IconCompatParcelizer() {
                    return rect;
                }
            });
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int iOnPlayFromMediaId = transitionSet.onPlayFromMediaId();
                while (i < iOnPlayFromMediaId) {
                    AudioAttributesCompatParcelizer(transitionSet.AudioAttributesCompatParcelizer(i), arrayList);
                    i++;
                }
                return;
            }
            if (write(transition) || !AudioAttributesCompatParcelizer((List) transition.onCustomAction())) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                transition.AudioAttributesCompatParcelizer(arrayList.get(i));
                i++;
            }
        }
    }

    private static boolean write(Transition transition) {
        return (AudioAttributesCompatParcelizer((List) transition.MediaBrowserCompatMediaItem()) && AudioAttributesCompatParcelizer((List) transition.onAddQueueItem()) && AudioAttributesCompatParcelizer((List) transition.onCommand())) ? false : true;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.IconCompatParcelizer((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.IconCompatParcelizer((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.IconCompatParcelizer((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void read(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).RemoteActionCompatParcelizer(new Transition.RemoteActionCompatParcelizer() { // from class: o.BubbleEntry.2
            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(Transition transition) {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer() {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer(Transition transition) {
                transition.AudioAttributesCompatParcelizer(this);
                transition.RemoteActionCompatParcelizer(this);
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void read(Transition transition) {
                transition.AudioAttributesCompatParcelizer(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object read(Object obj, Object obj2, Object obj3) {
        Transition transitionRemoteActionCompatParcelizer = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionRemoteActionCompatParcelizer != null && transition != null) {
            transitionRemoteActionCompatParcelizer = new TransitionSet().IconCompatParcelizer(transitionRemoteActionCompatParcelizer).IconCompatParcelizer(transition).RemoteActionCompatParcelizer(1);
        } else if (transitionRemoteActionCompatParcelizer == null) {
            transitionRemoteActionCompatParcelizer = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionRemoteActionCompatParcelizer;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionRemoteActionCompatParcelizer != null) {
            transitionSet.IconCompatParcelizer(transitionRemoteActionCompatParcelizer);
        }
        transitionSet.IconCompatParcelizer(transition2);
        return transitionSet;
    }

    @Override // kotlin._removeUnwantedAccessor
    public void write(ViewGroup viewGroup, Object obj) {
        reportWithProductId.RemoteActionCompatParcelizer(viewGroup, (Transition) obj);
    }

    @Override // kotlin._removeUnwantedAccessor
    public boolean write(Object obj) {
        boolean z = ((Transition) obj).read();
        if (!z) {
            Objects.toString(obj);
        }
        return z;
    }

    @Override // kotlin._removeUnwantedAccessor
    public Object IconCompatParcelizer(ViewGroup viewGroup, Object obj) {
        return reportWithProductId.read(viewGroup, (Transition) obj);
    }

    @Override // kotlin._removeUnwantedAccessor
    public void write(Object obj, float f) {
        onReceive onreceive = (onReceive) obj;
        if (onreceive.MediaBrowserCompatItemReceiver()) {
            long j = (long) (f * onreceive.read());
            if (j == 0) {
                j = 1;
            }
            if (j == onreceive.read()) {
                j = onreceive.read() - 1;
            }
            onreceive.read(j);
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Object obj) {
        ((onReceive) obj).write();
    }

    @Override // kotlin._removeUnwantedAccessor
    public void write(Object obj, Runnable runnable) {
        ((onReceive) obj).read(runnable);
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).RemoteActionCompatParcelizer(new GoogleConversionReporter1() { // from class: o.BubbleEntry.5
            @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer(Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    BubbleEntry.this.RemoteActionCompatParcelizer(obj5, arrayList, (ArrayList<View>) null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    BubbleEntry.this.RemoteActionCompatParcelizer(obj6, arrayList2, (ArrayList<View>) null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    BubbleEntry.this.RemoteActionCompatParcelizer(obj7, arrayList3, (ArrayList<View>) null);
                }
            }

            @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void read(Transition transition) {
                transition.AudioAttributesCompatParcelizer(this);
            }
        });
    }

    @Override // kotlin._removeUnwantedAccessor
    public void AudioAttributesCompatParcelizer(Fragment fragment, Object obj, _weirdKey _weirdkey, Runnable runnable) {
        IconCompatParcelizer(fragment, obj, _weirdkey, null, runnable);
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Fragment fragment, Object obj, _weirdKey _weirdkey, final Runnable runnable, final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        _weirdkey.write(new _weirdKey.AudioAttributesCompatParcelizer() { // from class: o.RadarEntry
            @Override // o._weirdKey.AudioAttributesCompatParcelizer
            public final void IconCompatParcelizer() {
                BubbleEntry.IconCompatParcelizer(runnable, transition, runnable2);
            }
        });
        transition.RemoteActionCompatParcelizer(new Transition.RemoteActionCompatParcelizer() { // from class: o.BubbleEntry.4
            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(Transition transition2) {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer() {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void IconCompatParcelizer(Transition transition2) {
            }

            @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void read(Transition transition2) {
                runnable2.run();
            }
        });
    }

    static /* synthetic */ void IconCompatParcelizer(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable == null) {
            transition.AudioAttributesCompatParcelizer();
            runnable2.run();
        } else {
            runnable.run();
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void IconCompatParcelizer(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.onCustomAction().clear();
            transitionSet.onCustomAction().addAll(arrayList2);
            RemoteActionCompatParcelizer((Object) transitionSet, arrayList, arrayList2);
        }
    }

    public final void RemoteActionCompatParcelizer(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iOnPlayFromMediaId = transitionSet.onPlayFromMediaId();
            while (i < iOnPlayFromMediaId) {
                RemoteActionCompatParcelizer((Object) transitionSet.AudioAttributesCompatParcelizer(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (write(transition)) {
            return;
        }
        List<View> listOnCustomAction = transition.onCustomAction();
        if (listOnCustomAction.size() == arrayList.size() && listOnCustomAction.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.AudioAttributesCompatParcelizer(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.RemoteActionCompatParcelizer(arrayList.get(size2));
            }
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void RemoteActionCompatParcelizer(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).AudioAttributesCompatParcelizer(view);
        }
    }

    @Override // kotlin._removeUnwantedAccessor
    public void read(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).read(new Transition.AudioAttributesCompatParcelizer() { // from class: o.BubbleEntry.1
                @Override // androidx.transition.Transition.AudioAttributesCompatParcelizer
                public final Rect IconCompatParcelizer() {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}
