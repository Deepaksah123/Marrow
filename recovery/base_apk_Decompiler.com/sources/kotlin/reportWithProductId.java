package kotlin;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class reportWithProductId {
    private setTitleOptional<report, Transition> RemoteActionCompatParcelizer = new setTitleOptional<>();
    private setTitleOptional<report, setTitleOptional<report, Transition>> write = new setTitleOptional<>();
    private static Transition IconCompatParcelizer = new AutoTransition();
    private static ThreadLocal<WeakReference<setTitleOptional<ViewGroup, ArrayList<Transition>>>> AudioAttributesCompatParcelizer = new ThreadLocal<>();
    static ArrayList<ViewGroup> read = new ArrayList<>();

    static setTitleOptional<ViewGroup, ArrayList<Transition>> RemoteActionCompatParcelizer() {
        setTitleOptional<ViewGroup, ArrayList<Transition>> settitleoptional;
        WeakReference<setTitleOptional<ViewGroup, ArrayList<Transition>>> weakReference = AudioAttributesCompatParcelizer.get();
        if (weakReference != null && (settitleoptional = weakReference.get()) != null) {
            return settitleoptional;
        }
        setTitleOptional<ViewGroup, ArrayList<Transition>> settitleoptional2 = new setTitleOptional<>();
        AudioAttributesCompatParcelizer.set(new WeakReference<>(settitleoptional2));
        return settitleoptional2;
    }

    private static void AudioAttributesCompatParcelizer(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(audioAttributesCompatParcelizer);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(audioAttributesCompatParcelizer);
    }

    static class AudioAttributesCompatParcelizer implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        ViewGroup AudioAttributesCompatParcelizer;
        private Transition RemoteActionCompatParcelizer;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        AudioAttributesCompatParcelizer(Transition transition, ViewGroup viewGroup) {
            this.RemoteActionCompatParcelizer = transition;
            this.AudioAttributesCompatParcelizer = viewGroup;
        }

        private void write() {
            this.AudioAttributesCompatParcelizer.getViewTreeObserver().removeOnPreDrawListener(this);
            this.AudioAttributesCompatParcelizer.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            write();
            reportWithProductId.read.remove(this.AudioAttributesCompatParcelizer);
            ArrayList<Transition> arrayList = reportWithProductId.RemoteActionCompatParcelizer().get(this.AudioAttributesCompatParcelizer);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
                }
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(true);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            write();
            if (!reportWithProductId.read.remove(this.AudioAttributesCompatParcelizer)) {
                return true;
            }
            final setTitleOptional<ViewGroup, ArrayList<Transition>> settitleoptionalRemoteActionCompatParcelizer = reportWithProductId.RemoteActionCompatParcelizer();
            ArrayList<Transition> arrayList = settitleoptionalRemoteActionCompatParcelizer.get(this.AudioAttributesCompatParcelizer);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                settitleoptionalRemoteActionCompatParcelizer.put(this.AudioAttributesCompatParcelizer, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new GoogleConversionReporter1() { // from class: o.reportWithProductId.AudioAttributesCompatParcelizer.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
                public final void read(Transition transition) {
                    ((ArrayList) settitleoptionalRemoteActionCompatParcelizer.get(AudioAttributesCompatParcelizer.this.AudioAttributesCompatParcelizer)).remove(transition);
                    transition.AudioAttributesCompatParcelizer(this);
                }
            });
            this.RemoteActionCompatParcelizer.write(this.AudioAttributesCompatParcelizer, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
                }
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            return true;
        }
    }

    private static void IconCompatParcelizer(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = RemoteActionCompatParcelizer().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(viewGroup);
            }
        }
        if (transition != null) {
            transition.write(viewGroup, true);
        }
        report reportVarRemoteActionCompatParcelizer = report.RemoteActionCompatParcelizer(viewGroup);
        if (reportVarRemoteActionCompatParcelizer != null) {
            reportVarRemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }

    public static void RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        RemoteActionCompatParcelizer(viewGroup, null);
    }

    public static void RemoteActionCompatParcelizer(ViewGroup viewGroup, Transition transition) {
        if (read.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        read.add(viewGroup);
        if (transition == null) {
            transition = IconCompatParcelizer;
        }
        Transition transitionClone = transition.clone();
        IconCompatParcelizer(viewGroup, transitionClone);
        report.read(viewGroup);
        AudioAttributesCompatParcelizer(viewGroup, transitionClone);
    }

    public static onReceive read(ViewGroup viewGroup, Transition transition) {
        if (read.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.read()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        read.add(viewGroup);
        Transition transitionClone = transition.clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.IconCompatParcelizer(transitionClone);
        IconCompatParcelizer(viewGroup, transitionSet);
        report.read(viewGroup);
        AudioAttributesCompatParcelizer(viewGroup, transitionSet);
        viewGroup.invalidate();
        return transitionSet.IconCompatParcelizer();
    }
}
