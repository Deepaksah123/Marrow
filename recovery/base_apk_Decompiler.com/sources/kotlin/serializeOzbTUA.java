package kotlin;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class serializeOzbTUA extends RecyclerView.RatingCompat {
    RecyclerView AudioAttributesCompatParcelizer;
    private Scroller IconCompatParcelizer;
    private final RecyclerView.MediaBrowserCompatSearchResultReceiver write = new RecyclerView.MediaBrowserCompatSearchResultReceiver() { // from class: o.serializeOzbTUA.4
        private boolean IconCompatParcelizer = false;

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
            super.AudioAttributesCompatParcelizer(recyclerView, i);
            if (i == 0 && this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
                serializeOzbTUA.this.IconCompatParcelizer();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.IconCompatParcelizer = true;
        }
    };

    public abstract int AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, int i2);

    public abstract View AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver);

    public abstract int[] write(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, View view);

    @Override // androidx.recyclerview.widget.RecyclerView.RatingCompat
    public final boolean read(int i, int i2) {
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        if (mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer == null || this.AudioAttributesCompatParcelizer.IconCompatParcelizer() == null) {
            return false;
        }
        int iAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        return (Math.abs(i2) > iAudioAttributesImplApi26Parcelizer || Math.abs(i) > iAudioAttributesImplApi26Parcelizer) && IconCompatParcelizer(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, i, i2);
    }

    public final void read(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.AudioAttributesCompatParcelizer;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                write();
            }
            this.AudioAttributesCompatParcelizer = recyclerView;
            if (recyclerView != null) {
                read();
                this.IconCompatParcelizer = new Scroller(this.AudioAttributesCompatParcelizer.getContext(), new DecelerateInterpolator());
                IconCompatParcelizer();
            }
        }
    }

    private void read() throws IllegalStateException {
        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write);
        this.AudioAttributesCompatParcelizer.setOnFlingListener(this);
    }

    private void write() {
        this.AudioAttributesCompatParcelizer.write(this.write);
        this.AudioAttributesCompatParcelizer.setOnFlingListener(null);
    }

    public final int[] IconCompatParcelizer(int i, int i2) {
        this.IconCompatParcelizer.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.IconCompatParcelizer.getFinalX(), this.IconCompatParcelizer.getFinalY()};
    }

    private boolean IconCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, int i2) {
        RecyclerView.onCustomAction oncustomaction;
        int iAudioAttributesCompatParcelizer;
        if (!(mediaBrowserCompatItemReceiver instanceof RecyclerView.onCustomAction.RemoteActionCompatParcelizer) || (oncustomaction = read(mediaBrowserCompatItemReceiver)) == null || (iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, i, i2)) == -1) {
            return false;
        }
        oncustomaction.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer);
        mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(oncustomaction);
        return true;
    }

    final void IconCompatParcelizer() {
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer;
        View viewAudioAttributesCompatParcelizer;
        RecyclerView recyclerView = this.AudioAttributesCompatParcelizer;
        if (recyclerView == null || (mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer()) == null || (viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer)) == null) {
            return;
        }
        int[] iArrWrite = write(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, viewAudioAttributesCompatParcelizer);
        int i = iArrWrite[0];
        if (i == 0 && iArrWrite[1] == 0) {
            return;
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(i, iArrWrite[1]);
    }

    protected RecyclerView.onCustomAction read(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        return IconCompatParcelizer(mediaBrowserCompatItemReceiver);
    }

    @Deprecated
    private deserializeKeylj4SQcc IconCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver instanceof RecyclerView.onCustomAction.RemoteActionCompatParcelizer) {
            return new deserializeKeylj4SQcc(this.AudioAttributesCompatParcelizer.getContext()) { // from class: o.serializeOzbTUA.5
                @Override // kotlin.deserializeKeylj4SQcc, androidx.recyclerview.widget.RecyclerView.onCustomAction
                public final void IconCompatParcelizer(View view, RecyclerView.onCustomAction.write writeVar) {
                    if (serializeOzbTUA.this.AudioAttributesCompatParcelizer != null) {
                        serializeOzbTUA serializeozbtua = serializeOzbTUA.this;
                        int[] iArrWrite = serializeozbtua.write(serializeozbtua.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(), view);
                        int i = iArrWrite[0];
                        int i2 = iArrWrite[1];
                        int iWrite = write(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iWrite > 0) {
                            writeVar.IconCompatParcelizer(i, i2, iWrite, ((deserializeKeylj4SQcc) this).write);
                        }
                    }
                }

                @Override // kotlin.deserializeKeylj4SQcc
                protected final float AudioAttributesCompatParcelizer(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }
            };
        }
        return null;
    }
}
