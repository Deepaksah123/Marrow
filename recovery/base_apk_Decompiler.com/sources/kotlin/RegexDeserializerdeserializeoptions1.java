package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RegexDeserializerdeserializeoptions1 extends deserializeKeyuT2Fmlo {
    private static TimeInterpolator MediaBrowserCompatCustomActionResultReceiver;
    private ArrayList<RecyclerView.onMediaButtonEvent> RatingCompat = new ArrayList<>();
    private ArrayList<RecyclerView.onMediaButtonEvent> AudioAttributesImplBaseParcelizer = new ArrayList<>();
    private ArrayList<write> MediaBrowserCompatMediaItem = new ArrayList<>();
    private ArrayList<IconCompatParcelizer> AudioAttributesImplApi21Parcelizer = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.onMediaButtonEvent>> AudioAttributesCompatParcelizer = new ArrayList<>();
    ArrayList<ArrayList<write>> AudioAttributesImplApi26Parcelizer = new ArrayList<>();
    ArrayList<ArrayList<IconCompatParcelizer>> write = new ArrayList<>();
    ArrayList<RecyclerView.onMediaButtonEvent> read = new ArrayList<>();
    ArrayList<RecyclerView.onMediaButtonEvent> IconCompatParcelizer = new ArrayList<>();
    ArrayList<RecyclerView.onMediaButtonEvent> MediaBrowserCompatItemReceiver = new ArrayList<>();
    ArrayList<RecyclerView.onMediaButtonEvent> RemoteActionCompatParcelizer = new ArrayList<>();

    static class write {
        public int AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public RecyclerView.onMediaButtonEvent read;
        public int write;

        write(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i, int i2, int i3, int i4) {
            this.read = onmediabuttonevent;
            this.write = i;
            this.IconCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.AudioAttributesCompatParcelizer = i4;
        }
    }

    static class IconCompatParcelizer {
        public int AudioAttributesCompatParcelizer;
        public int AudioAttributesImplBaseParcelizer;
        public RecyclerView.onMediaButtonEvent IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public RecyclerView.onMediaButtonEvent read;
        public int write;

        private IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.onMediaButtonEvent onmediabuttonevent2) {
            this.IconCompatParcelizer = onmediabuttonevent;
            this.read = onmediabuttonevent2;
        }

        IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.onMediaButtonEvent onmediabuttonevent2, int i, int i2, int i3, int i4) {
            this(onmediabuttonevent, onmediabuttonevent2);
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.write = i3;
            this.AudioAttributesImplBaseParcelizer = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", newHolder=");
            sb.append(this.read);
            sb.append(", fromX=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", fromY=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", toX=");
            sb.append(this.write);
            sb.append(", toY=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append('}');
            return sb.toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final void RemoteActionCompatParcelizer() {
        boolean zIsEmpty = this.RatingCompat.isEmpty();
        boolean zIsEmpty2 = this.MediaBrowserCompatMediaItem.isEmpty();
        boolean zIsEmpty3 = this.AudioAttributesImplApi21Parcelizer.isEmpty();
        boolean zIsEmpty4 = this.AudioAttributesImplBaseParcelizer.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.onMediaButtonEvent> it = this.RatingCompat.iterator();
        while (it.hasNext()) {
            MediaMetadataCompat(it.next());
        }
        this.RatingCompat.clear();
        if (!zIsEmpty2) {
            final ArrayList<write> arrayList = new ArrayList<>();
            arrayList.addAll(this.MediaBrowserCompatMediaItem);
            this.AudioAttributesImplApi26Parcelizer.add(arrayList);
            this.MediaBrowserCompatMediaItem.clear();
            Runnable runnable = new Runnable() { // from class: o.RegexDeserializerdeserializeoptions1.1
                @Override // java.lang.Runnable
                public final void run() {
                    for (write writeVar : arrayList) {
                        RegexDeserializerdeserializeoptions1.this.IconCompatParcelizer(writeVar.read, writeVar.write, writeVar.IconCompatParcelizer, writeVar.RemoteActionCompatParcelizer, writeVar.AudioAttributesCompatParcelizer);
                    }
                    arrayList.clear();
                    RegexDeserializerdeserializeoptions1.this.AudioAttributesImplApi26Parcelizer.remove(arrayList);
                }
            };
            if (!zIsEmpty) {
                InvalidTypeIdException.read(arrayList.get(0).read.itemView, runnable, AudioAttributesImplBaseParcelizer());
            } else {
                runnable.run();
            }
        }
        if (!zIsEmpty3) {
            final ArrayList<IconCompatParcelizer> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.AudioAttributesImplApi21Parcelizer);
            this.write.add(arrayList2);
            this.AudioAttributesImplApi21Parcelizer.clear();
            Runnable runnable2 = new Runnable() { // from class: o.RegexDeserializerdeserializeoptions1.5
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        RegexDeserializerdeserializeoptions1.this.RemoteActionCompatParcelizer((IconCompatParcelizer) it2.next());
                    }
                    arrayList2.clear();
                    RegexDeserializerdeserializeoptions1.this.write.remove(arrayList2);
                }
            };
            if (!zIsEmpty) {
                InvalidTypeIdException.read(arrayList2.get(0).IconCompatParcelizer.itemView, runnable2, AudioAttributesImplBaseParcelizer());
            } else {
                runnable2.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList<RecyclerView.onMediaButtonEvent> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesCompatParcelizer.add(arrayList3);
        this.AudioAttributesImplBaseParcelizer.clear();
        Runnable runnable3 = new Runnable() { // from class: o.RegexDeserializerdeserializeoptions1.2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer((RecyclerView.onMediaButtonEvent) it2.next());
                }
                arrayList3.clear();
                RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer.remove(arrayList3);
            }
        };
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
            InvalidTypeIdException.read(arrayList3.get(0).itemView, runnable3, (!zIsEmpty ? AudioAttributesImplBaseParcelizer() : 0L) + Math.max(!zIsEmpty2 ? MediaBrowserCompatItemReceiver() : 0L, zIsEmpty3 ? 0L : AudioAttributesImplApi21Parcelizer()));
        } else {
            runnable3.run();
        }
    }

    @Override // kotlin.deserializeKeyuT2Fmlo
    public final boolean IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        MediaBrowserCompatSearchResultReceiver(onmediabuttonevent);
        this.RatingCompat.add(onmediabuttonevent);
        return true;
    }

    private void MediaMetadataCompat(final RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        final View view = onmediabuttonevent.itemView;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.MediaBrowserCompatItemReceiver.add(onmediabuttonevent);
        viewPropertyAnimatorAnimate.setDuration(AudioAttributesImplBaseParcelizer()).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: o.RegexDeserializerdeserializeoptions1.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                RegexDeserializerdeserializeoptions1.this.MediaDescriptionCompat(onmediabuttonevent);
                RegexDeserializerdeserializeoptions1.this.MediaBrowserCompatItemReceiver.remove(onmediabuttonevent);
                RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer();
            }
        }).start();
    }

    @Override // kotlin.deserializeKeyuT2Fmlo
    public final boolean read(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        MediaBrowserCompatSearchResultReceiver(onmediabuttonevent);
        onmediabuttonevent.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplBaseParcelizer.add(onmediabuttonevent);
        return true;
    }

    final void AudioAttributesCompatParcelizer(final RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        final View view = onmediabuttonevent.itemView;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.read.add(onmediabuttonevent);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(AudioAttributesImplApi26Parcelizer()).setListener(new AnimatorListenerAdapter() { // from class: o.RegexDeserializerdeserializeoptions1.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                RegexDeserializerdeserializeoptions1.this.MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
                RegexDeserializerdeserializeoptions1.this.read.remove(onmediabuttonevent);
                RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer();
            }
        }).start();
    }

    @Override // kotlin.deserializeKeyuT2Fmlo
    public final boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i, int i2, int i3, int i4) {
        View view = onmediabuttonevent.itemView;
        int translationX = i + ((int) onmediabuttonevent.itemView.getTranslationX());
        int translationY = i2 + ((int) onmediabuttonevent.itemView.getTranslationY());
        MediaBrowserCompatSearchResultReceiver(onmediabuttonevent);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            RatingCompat(onmediabuttonevent);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.MediaBrowserCompatMediaItem.add(new write(onmediabuttonevent, translationX, translationY, i3, i4));
        return true;
    }

    final void IconCompatParcelizer(final RecyclerView.onMediaButtonEvent onmediabuttonevent, int i, int i2, int i3, int i4) {
        final View view = onmediabuttonevent.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (i6 != 0) {
            view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.IconCompatParcelizer.add(onmediabuttonevent);
        viewPropertyAnimatorAnimate.setDuration(MediaBrowserCompatItemReceiver()).setListener(new AnimatorListenerAdapter() { // from class: o.RegexDeserializerdeserializeoptions1.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                if (i6 != 0) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                RegexDeserializerdeserializeoptions1.this.RatingCompat(onmediabuttonevent);
                RegexDeserializerdeserializeoptions1.this.IconCompatParcelizer.remove(onmediabuttonevent);
                RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer();
            }
        }).start();
    }

    @Override // kotlin.deserializeKeyuT2Fmlo
    public final boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.onMediaButtonEvent onmediabuttonevent2, int i, int i2, int i3, int i4) {
        if (onmediabuttonevent == onmediabuttonevent2) {
            return write(onmediabuttonevent, i, i2, i3, i4);
        }
        float translationX = onmediabuttonevent.itemView.getTranslationX();
        float translationY = onmediabuttonevent.itemView.getTranslationY();
        float alpha = onmediabuttonevent.itemView.getAlpha();
        MediaBrowserCompatSearchResultReceiver(onmediabuttonevent);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        onmediabuttonevent.itemView.setTranslationX(translationX);
        onmediabuttonevent.itemView.setTranslationY(translationY);
        onmediabuttonevent.itemView.setAlpha(alpha);
        if (onmediabuttonevent2 != null) {
            MediaBrowserCompatSearchResultReceiver(onmediabuttonevent2);
            onmediabuttonevent2.itemView.setTranslationX(-i5);
            onmediabuttonevent2.itemView.setTranslationY(-i6);
            onmediabuttonevent2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.AudioAttributesImplApi21Parcelizer.add(new IconCompatParcelizer(onmediabuttonevent, onmediabuttonevent2, i, i2, i3, i4));
        return true;
    }

    final void RemoteActionCompatParcelizer(final IconCompatParcelizer iconCompatParcelizer) {
        RecyclerView.onMediaButtonEvent onmediabuttonevent = iconCompatParcelizer.IconCompatParcelizer;
        final View view = onmediabuttonevent == null ? null : onmediabuttonevent.itemView;
        RecyclerView.onMediaButtonEvent onmediabuttonevent2 = iconCompatParcelizer.read;
        final View view2 = onmediabuttonevent2 != null ? onmediabuttonevent2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(AudioAttributesImplApi21Parcelizer());
            this.RemoteActionCompatParcelizer.add(iconCompatParcelizer.IconCompatParcelizer);
            duration.translationX(iconCompatParcelizer.write - iconCompatParcelizer.RemoteActionCompatParcelizer);
            duration.translationY(iconCompatParcelizer.AudioAttributesImplBaseParcelizer - iconCompatParcelizer.AudioAttributesCompatParcelizer);
            duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: o.RegexDeserializerdeserializeoptions1.9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    RecyclerView.onMediaButtonEvent onmediabuttonevent3 = iconCompatParcelizer.IconCompatParcelizer;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    RegexDeserializerdeserializeoptions1.this.MediaBrowserCompatMediaItem(iconCompatParcelizer.IconCompatParcelizer);
                    RegexDeserializerdeserializeoptions1.this.RemoteActionCompatParcelizer.remove(iconCompatParcelizer.IconCompatParcelizer);
                    RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.RemoteActionCompatParcelizer.add(iconCompatParcelizer.read);
            viewPropertyAnimatorAnimate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(AudioAttributesImplApi21Parcelizer()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: o.RegexDeserializerdeserializeoptions1.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    RecyclerView.onMediaButtonEvent onmediabuttonevent3 = iconCompatParcelizer.read;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    RegexDeserializerdeserializeoptions1.this.MediaBrowserCompatMediaItem(iconCompatParcelizer.read);
                    RegexDeserializerdeserializeoptions1.this.RemoteActionCompatParcelizer.remove(iconCompatParcelizer.read);
                    RegexDeserializerdeserializeoptions1.this.AudioAttributesCompatParcelizer();
                }
            }).start();
        }
    }

    private void read(List<IconCompatParcelizer> list, RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        for (int size = list.size() - 1; size >= 0; size--) {
            IconCompatParcelizer iconCompatParcelizer = list.get(size);
            if (AudioAttributesCompatParcelizer(iconCompatParcelizer, onmediabuttonevent) && iconCompatParcelizer.IconCompatParcelizer == null && iconCompatParcelizer.read == null) {
                list.remove(iconCompatParcelizer);
            }
        }
    }

    private void write(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.IconCompatParcelizer != null) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer);
        }
        if (iconCompatParcelizer.read != null) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer.read);
        }
    }

    private boolean AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        if (iconCompatParcelizer.read == onmediabuttonevent) {
            iconCompatParcelizer.read = null;
        } else {
            if (iconCompatParcelizer.IconCompatParcelizer != onmediabuttonevent) {
                return false;
            }
            iconCompatParcelizer.IconCompatParcelizer = null;
        }
        onmediabuttonevent.itemView.setAlpha(1.0f);
        onmediabuttonevent.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        onmediabuttonevent.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        MediaBrowserCompatMediaItem(onmediabuttonevent);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final void write(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        View view = onmediabuttonevent.itemView;
        view.animate().cancel();
        int size = this.MediaBrowserCompatMediaItem.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.MediaBrowserCompatMediaItem.get(size).read == onmediabuttonevent) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                RatingCompat(onmediabuttonevent);
                this.MediaBrowserCompatMediaItem.remove(size);
            }
        }
        read(this.AudioAttributesImplApi21Parcelizer, onmediabuttonevent);
        if (this.RatingCompat.remove(onmediabuttonevent)) {
            view.setAlpha(1.0f);
            MediaDescriptionCompat(onmediabuttonevent);
        }
        if (this.AudioAttributesImplBaseParcelizer.remove(onmediabuttonevent)) {
            view.setAlpha(1.0f);
            MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
        }
        for (int size2 = this.write.size() - 1; size2 >= 0; size2--) {
            ArrayList<IconCompatParcelizer> arrayList = this.write.get(size2);
            read(arrayList, onmediabuttonevent);
            if (arrayList.isEmpty()) {
                this.write.remove(size2);
            }
        }
        for (int size3 = this.AudioAttributesImplApi26Parcelizer.size() - 1; size3 >= 0; size3--) {
            ArrayList<write> arrayList2 = this.AudioAttributesImplApi26Parcelizer.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).read == onmediabuttonevent) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    RatingCompat(onmediabuttonevent);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.AudioAttributesImplApi26Parcelizer.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.AudioAttributesCompatParcelizer.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.onMediaButtonEvent> arrayList3 = this.AudioAttributesCompatParcelizer.get(size5);
            if (arrayList3.remove(onmediabuttonevent)) {
                view.setAlpha(1.0f);
                MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
                if (arrayList3.isEmpty()) {
                    this.AudioAttributesCompatParcelizer.remove(size5);
                }
            }
        }
        this.MediaBrowserCompatItemReceiver.remove(onmediabuttonevent);
        this.read.remove(onmediabuttonevent);
        this.RemoteActionCompatParcelizer.remove(onmediabuttonevent);
        this.IconCompatParcelizer.remove(onmediabuttonevent);
        AudioAttributesCompatParcelizer();
    }

    private void MediaBrowserCompatSearchResultReceiver(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        if (MediaBrowserCompatCustomActionResultReceiver == null) {
            MediaBrowserCompatCustomActionResultReceiver = new ValueAnimator().getInterpolator();
        }
        onmediabuttonevent.itemView.animate().setInterpolator(MediaBrowserCompatCustomActionResultReceiver);
        write(onmediabuttonevent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean IconCompatParcelizer() {
        return (this.AudioAttributesImplBaseParcelizer.isEmpty() && this.AudioAttributesImplApi21Parcelizer.isEmpty() && this.MediaBrowserCompatMediaItem.isEmpty() && this.RatingCompat.isEmpty() && this.IconCompatParcelizer.isEmpty() && this.MediaBrowserCompatItemReceiver.isEmpty() && this.read.isEmpty() && this.RemoteActionCompatParcelizer.isEmpty() && this.AudioAttributesImplApi26Parcelizer.isEmpty() && this.AudioAttributesCompatParcelizer.isEmpty() && this.write.isEmpty()) ? false : true;
    }

    final void AudioAttributesCompatParcelizer() {
        if (IconCompatParcelizer()) {
            return;
        }
        read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final void write() {
        int size = this.MediaBrowserCompatMediaItem.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            write writeVar = this.MediaBrowserCompatMediaItem.get(size);
            View view = writeVar.read.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            RatingCompat(writeVar.read);
            this.MediaBrowserCompatMediaItem.remove(size);
        }
        for (int size2 = this.RatingCompat.size() - 1; size2 >= 0; size2--) {
            MediaDescriptionCompat(this.RatingCompat.get(size2));
            this.RatingCompat.remove(size2);
        }
        int size3 = this.AudioAttributesImplBaseParcelizer.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.onMediaButtonEvent onmediabuttonevent = this.AudioAttributesImplBaseParcelizer.get(size3);
            onmediabuttonevent.itemView.setAlpha(1.0f);
            MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent);
            this.AudioAttributesImplBaseParcelizer.remove(size3);
        }
        for (int size4 = this.AudioAttributesImplApi21Parcelizer.size() - 1; size4 >= 0; size4--) {
            write(this.AudioAttributesImplApi21Parcelizer.get(size4));
        }
        this.AudioAttributesImplApi21Parcelizer.clear();
        if (IconCompatParcelizer()) {
            for (int size5 = this.AudioAttributesImplApi26Parcelizer.size() - 1; size5 >= 0; size5--) {
                ArrayList<write> arrayList = this.AudioAttributesImplApi26Parcelizer.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    write writeVar2 = arrayList.get(size6);
                    View view2 = writeVar2.read.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    RatingCompat(writeVar2.read);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.AudioAttributesImplApi26Parcelizer.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.AudioAttributesCompatParcelizer.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.onMediaButtonEvent> arrayList2 = this.AudioAttributesCompatParcelizer.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.onMediaButtonEvent onmediabuttonevent2 = arrayList2.get(size8);
                    onmediabuttonevent2.itemView.setAlpha(1.0f);
                    MediaBrowserCompatCustomActionResultReceiver(onmediabuttonevent2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.AudioAttributesCompatParcelizer.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.write.size() - 1; size9 >= 0; size9--) {
                ArrayList<IconCompatParcelizer> arrayList3 = this.write.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    write(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.write.remove(arrayList3);
                    }
                }
            }
            RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            RemoteActionCompatParcelizer(this.read);
            RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            read();
        }
    }

    private static void RemoteActionCompatParcelizer(List<RecyclerView.onMediaButtonEvent> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, List<Object> list) {
        return !list.isEmpty() || super.IconCompatParcelizer(onmediabuttonevent, list);
    }
}
