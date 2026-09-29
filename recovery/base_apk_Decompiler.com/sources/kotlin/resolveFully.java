package kotlin;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class resolveFully {

    public interface IconCompatParcelizer<T, V> {
        int IconCompatParcelizer(T t);

        V read(T t, int i);
    }

    public interface RemoteActionCompatParcelizer<T> {
        void read(T t, Rect rect);
    }

    private static int IconCompatParcelizer(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static <L, T> T write(L l, IconCompatParcelizer<L, T> iconCompatParcelizer, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, T t, int i, boolean z) {
        int iIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer(l);
        ArrayList arrayList = new ArrayList(iIconCompatParcelizer);
        for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
            arrayList.add(iconCompatParcelizer.read(l, i2));
        }
        Collections.sort(arrayList, new read(z, remoteActionCompatParcelizer));
        if (i == 1) {
            return (T) AudioAttributesCompatParcelizer((Object) t, arrayList, false);
        }
        if (i == 2) {
            return (T) write((Object) t, arrayList, false);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T write(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        return null;
    }

    private static <T> T AudioAttributesCompatParcelizer(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        if (t != null) {
            size = arrayList.indexOf(t);
        }
        int i = size - 1;
        if (i >= 0) {
            return arrayList.get(i);
        }
        return null;
    }

    static class read<T> implements Comparator<T> {
        private final RemoteActionCompatParcelizer<T> AudioAttributesCompatParcelizer;
        private final boolean write;
        private final Rect RemoteActionCompatParcelizer = new Rect();
        private final Rect IconCompatParcelizer = new Rect();

        read(boolean z, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
            this.write = z;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Rect rect = this.RemoteActionCompatParcelizer;
            Rect rect2 = this.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer.read(t, rect);
            this.AudioAttributesCompatParcelizer.read(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                return this.write ? 1 : -1;
            }
            if (rect.left > rect2.left) {
                return this.write ? -1 : 1;
            }
            if (rect.bottom < rect2.bottom) {
                return -1;
            }
            if (rect.bottom > rect2.bottom) {
                return 1;
            }
            if (rect.right < rect2.right) {
                return this.write ? 1 : -1;
            }
            if (rect.right > rect2.right) {
                return this.write ? -1 : 1;
            }
            return 0;
        }
    }

    public static <L, T> T IconCompatParcelizer(L l, IconCompatParcelizer<L, T> iconCompatParcelizer, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int iIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
            T t3 = iconCompatParcelizer.read(l, i2);
            if (t3 != t) {
                remoteActionCompatParcelizer.read(t3, rect3);
                if (AudioAttributesCompatParcelizer(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = t3;
                }
            }
        }
        return t2;
    }

    private static boolean AudioAttributesCompatParcelizer(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!IconCompatParcelizer(rect, rect2, i)) {
            return false;
        }
        if (IconCompatParcelizer(rect, rect3, i) && !RemoteActionCompatParcelizer(i, rect, rect2, rect3)) {
            return !RemoteActionCompatParcelizer(i, rect, rect3, rect2) && IconCompatParcelizer(AudioAttributesCompatParcelizer(i, rect, rect2), MediaBrowserCompatItemReceiver(i, rect, rect2)) < IconCompatParcelizer(AudioAttributesCompatParcelizer(i, rect, rect3), MediaBrowserCompatItemReceiver(i, rect, rect3));
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean zWrite = write(i, rect, rect2);
        if (write(i, rect, rect3) || !zWrite) {
            return false;
        }
        return !read(i, rect, rect3) || i == 17 || i == 66 || AudioAttributesCompatParcelizer(i, rect, rect2) < RemoteActionCompatParcelizer(i, rect, rect3);
    }

    private static boolean IconCompatParcelizer(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static boolean write(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static boolean read(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int AudioAttributesCompatParcelizer(int i, Rect rect, Rect rect2) {
        return Math.max(0, IconCompatParcelizer(i, rect, rect2));
    }

    private static int IconCompatParcelizer(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int RemoteActionCompatParcelizer(int i, Rect rect, Rect rect2) {
        return Math.max(1, MediaBrowserCompatCustomActionResultReceiver(i, rect, rect2));
    }

    private static int MediaBrowserCompatCustomActionResultReceiver(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int MediaBrowserCompatItemReceiver(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
