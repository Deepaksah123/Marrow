package kotlin;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.flexbox.FlexItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isSeekable {
    public long[] AudioAttributesCompatParcelizer;
    public int[] IconCompatParcelizer;
    private final BinarySearchSeekerBinarySearchSeekMap RemoteActionCompatParcelizer;
    private boolean[] read;
    private long[] write;

    public static int RemoteActionCompatParcelizer(long j) {
        return (int) (j >> 32);
    }

    public static int read(long j) {
        return (int) j;
    }

    private static long write(int i, int i2) {
        long j = -1;
        return (((long) i) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) i2) << 32);
    }

    public isSeekable(BinarySearchSeekerBinarySearchSeekMap binarySearchSeekerBinarySearchSeekMap) {
        this.RemoteActionCompatParcelizer = binarySearchSeekerBinarySearchSeekMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] AudioAttributesCompatParcelizer(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        List<RemoteActionCompatParcelizer> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer((byte) 0);
        if (view != null && (layoutParams instanceof FlexItem)) {
            remoteActionCompatParcelizer.read = ((FlexItem) layoutParams).MediaBrowserCompatMediaItem();
        } else {
            remoteActionCompatParcelizer.read = 1;
        }
        if (i != -1 && i != iAudioAttributesCompatParcelizer && i < this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = i;
            while (i < iAudioAttributesCompatParcelizer) {
                listRemoteActionCompatParcelizer.get(i).AudioAttributesCompatParcelizer++;
                i++;
            }
        } else {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer;
        }
        listRemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
        return write(iAudioAttributesCompatParcelizer + 1, listRemoteActionCompatParcelizer, sparseIntArray);
    }

    public final int[] write(SparseIntArray sparseIntArray) {
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        return write(iAudioAttributesCompatParcelizer, RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer), sparseIntArray);
    }

    private List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer(int i) {
        ArrayList arrayList = new ArrayList(i);
        byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i2).getLayoutParams();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(b);
            remoteActionCompatParcelizer.read = flexItem.MediaBrowserCompatMediaItem();
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = i2;
            arrayList.add(remoteActionCompatParcelizer);
        }
        return arrayList;
    }

    public final boolean read(SparseIntArray sparseIntArray) {
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (sparseIntArray.size() != iAudioAttributesCompatParcelizer) {
            return true;
        }
        for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
            View viewAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
            if (viewAudioAttributesCompatParcelizer != null && ((FlexItem) viewAudioAttributesCompatParcelizer.getLayoutParams()).MediaBrowserCompatMediaItem() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private static int[] write(int i, List<RemoteActionCompatParcelizer> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
            iArr[i2] = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            sparseIntArray.append(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.read);
            i2++;
        }
        return iArr;
    }

    public final void write(read readVar, int i, int i2) {
        RemoteActionCompatParcelizer(readVar, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    public final void IconCompatParcelizer(read readVar, int i, int i2, int i3, int i4, List<skipInputUntilPosition> list) {
        RemoteActionCompatParcelizer(readVar, i, i2, i3, i4, -1, list);
    }

    public final void AudioAttributesCompatParcelizer(read readVar, int i, int i2, int i3, int i4, List<skipInputUntilPosition> list) {
        RemoteActionCompatParcelizer(readVar, i, i2, i3, 0, i4, list);
    }

    public final void IconCompatParcelizer(read readVar, int i, int i2) {
        RemoteActionCompatParcelizer(readVar, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public final void RemoteActionCompatParcelizer(read readVar, int i, int i2, int i3, int i4, List<skipInputUntilPosition> list) {
        RemoteActionCompatParcelizer(readVar, i2, i, i3, i4, -1, list);
    }

    public final void read(read readVar, int i, int i2, int i3, int i4, List<skipInputUntilPosition> list) {
        RemoteActionCompatParcelizer(readVar, i2, i, i3, 0, i4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RemoteActionCompatParcelizer(read readVar, int i, int i2, int i3, int i4, int i5, List<skipInputUntilPosition> list) {
        read readVar2;
        int i6;
        int i7;
        int i8;
        List<skipInputUntilPosition> list2;
        int i9;
        List<skipInputUntilPosition> list3;
        int i10;
        int i11;
        View view;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        skipInputUntilPosition skipinputuntilposition;
        int i19;
        int i20 = i;
        int i21 = i2;
        boolean zMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<skipInputUntilPosition> arrayList = list == null ? new ArrayList() : list;
        readVar.RemoteActionCompatParcelizer = arrayList;
        boolean z = i5 == -1;
        int iIconCompatParcelizer = IconCompatParcelizer(zMediaBrowserCompatMediaItem);
        int iWrite = write(zMediaBrowserCompatMediaItem);
        int i22 = read(zMediaBrowserCompatMediaItem);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(zMediaBrowserCompatMediaItem);
        skipInputUntilPosition skipinputuntilposition2 = new skipInputUntilPosition();
        int i23 = i4;
        skipinputuntilposition2.MediaBrowserCompatItemReceiver = i23;
        int i24 = iWrite + iIconCompatParcelizer;
        skipinputuntilposition2.RatingCompat = i24;
        int iAudioAttributesCompatParcelizer2 = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        boolean z2 = z;
        int i25 = Integer.MIN_VALUE;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i23 >= iAudioAttributesCompatParcelizer2) {
                readVar2 = readVar;
                break;
            }
            View viewIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(i23);
            if (viewIconCompatParcelizer == null) {
                if (RemoteActionCompatParcelizer(i23, iAudioAttributesCompatParcelizer2, skipinputuntilposition2)) {
                    write(arrayList, skipinputuntilposition2, i23, i27);
                }
            } else if (viewIconCompatParcelizer.getVisibility() == 8) {
                skipinputuntilposition2.AudioAttributesImplBaseParcelizer++;
                skipinputuntilposition2.AudioAttributesImplApi26Parcelizer++;
                if (RemoteActionCompatParcelizer(i23, iAudioAttributesCompatParcelizer2, skipinputuntilposition2)) {
                    write(arrayList, skipinputuntilposition2, i23, i27);
                }
            } else {
                if (viewIconCompatParcelizer instanceof CompoundButton) {
                    read((CompoundButton) viewIconCompatParcelizer);
                }
                FlexItem flexItem = (FlexItem) viewIconCompatParcelizer.getLayoutParams();
                int i29 = iAudioAttributesCompatParcelizer2;
                if (flexItem.RemoteActionCompatParcelizer() == 4) {
                    skipinputuntilposition2.MediaBrowserCompatCustomActionResultReceiver.add(Integer.valueOf(i23));
                }
                int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(flexItem, zMediaBrowserCompatMediaItem);
                if (flexItem.IconCompatParcelizer() != -1.0f && mode == 1073741824) {
                    iAudioAttributesImplApi21Parcelizer = Math.round(size * flexItem.IconCompatParcelizer());
                }
                if (zMediaBrowserCompatMediaItem) {
                    i6 = size;
                    int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i20, i24 + AudioAttributesCompatParcelizer(flexItem, true) + read(flexItem, true), iAudioAttributesImplApi21Parcelizer);
                    i7 = mode;
                    int iWrite2 = this.RemoteActionCompatParcelizer.write(i21, i22 + iAudioAttributesCompatParcelizer + IconCompatParcelizer(flexItem, true) + RemoteActionCompatParcelizer(flexItem, true) + i27, write(flexItem, true));
                    viewIconCompatParcelizer.measure(iRemoteActionCompatParcelizer, iWrite2);
                    RemoteActionCompatParcelizer(i23, iRemoteActionCompatParcelizer, iWrite2, viewIconCompatParcelizer);
                    i9 = iRemoteActionCompatParcelizer;
                    list2 = arrayList;
                    i8 = 0;
                } else {
                    i6 = size;
                    i7 = mode;
                    i8 = 0;
                    list2 = arrayList;
                    int iRemoteActionCompatParcelizer2 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i21, i22 + iAudioAttributesCompatParcelizer + IconCompatParcelizer(flexItem, false) + RemoteActionCompatParcelizer(flexItem, false) + i27, write(flexItem, false));
                    int iWrite3 = this.RemoteActionCompatParcelizer.write(i20, AudioAttributesCompatParcelizer(flexItem, false) + i24 + read(flexItem, false), iAudioAttributesImplApi21Parcelizer);
                    viewIconCompatParcelizer.measure(iRemoteActionCompatParcelizer2, iWrite3);
                    RemoteActionCompatParcelizer(i23, iRemoteActionCompatParcelizer2, iWrite3, viewIconCompatParcelizer);
                    i9 = iWrite3;
                }
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i23, viewIconCompatParcelizer);
                write(viewIconCompatParcelizer, i23);
                int iCombineMeasuredStates = View.combineMeasuredStates(i26, viewIconCompatParcelizer.getMeasuredState());
                int i30 = skipinputuntilposition2.RatingCompat;
                int i31 = read(viewIconCompatParcelizer, zMediaBrowserCompatMediaItem);
                int iAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(flexItem, zMediaBrowserCompatMediaItem);
                int i32 = read(flexItem, zMediaBrowserCompatMediaItem);
                int size2 = list2.size();
                int i33 = i32 + i31 + iAudioAttributesCompatParcelizer3;
                int i34 = i24;
                skipInputUntilPosition skipinputuntilposition3 = skipinputuntilposition2;
                int i35 = i8;
                int i36 = i27;
                int i37 = i23;
                list3 = list2;
                int i38 = i9;
                i10 = i37;
                if (AudioAttributesCompatParcelizer(viewIconCompatParcelizer, i7, i6, i30, i33, flexItem, i37, i28, size2)) {
                    if (skipinputuntilposition3.write() > 0) {
                        if (i10 > 0) {
                            i19 = i10 - 1;
                            skipinputuntilposition = skipinputuntilposition3;
                        } else {
                            skipinputuntilposition = skipinputuntilposition3;
                            i19 = i35;
                        }
                        write(list3, skipinputuntilposition, i19, i36);
                        i18 = i36 + skipinputuntilposition.write;
                    } else {
                        i18 = i36;
                    }
                    if (zMediaBrowserCompatMediaItem) {
                        if (flexItem.read() == -1) {
                            BinarySearchSeekerBinarySearchSeekMap binarySearchSeekerBinarySearchSeekMap = this.RemoteActionCompatParcelizer;
                            int paddingTop = binarySearchSeekerBinarySearchSeekMap.getPaddingTop() + this.RemoteActionCompatParcelizer.getPaddingBottom() + flexItem.AudioAttributesImplApi21Parcelizer() + flexItem.AudioAttributesImplBaseParcelizer() + i18;
                            i11 = i2;
                            int iWrite4 = binarySearchSeekerBinarySearchSeekMap.write(i11, paddingTop, flexItem.read());
                            view = viewIconCompatParcelizer;
                            view.measure(i38, iWrite4);
                            write(view, i10);
                        } else {
                            i11 = i2;
                            view = viewIconCompatParcelizer;
                        }
                    } else {
                        i11 = i2;
                        view = viewIconCompatParcelizer;
                        if (flexItem.MediaMetadataCompat() == -1) {
                            BinarySearchSeekerBinarySearchSeekMap binarySearchSeekerBinarySearchSeekMap2 = this.RemoteActionCompatParcelizer;
                            view.measure(binarySearchSeekerBinarySearchSeekMap2.RemoteActionCompatParcelizer(i11, binarySearchSeekerBinarySearchSeekMap2.getPaddingLeft() + this.RemoteActionCompatParcelizer.getPaddingRight() + flexItem.MediaBrowserCompatCustomActionResultReceiver() + flexItem.AudioAttributesImplApi26Parcelizer() + i18, flexItem.MediaMetadataCompat()), i38);
                            write(view, i10);
                        }
                    }
                    skipinputuntilposition2 = new skipInputUntilPosition();
                    skipinputuntilposition2.AudioAttributesImplApi26Parcelizer = 1;
                    i12 = i34;
                    skipinputuntilposition2.RatingCompat = i12;
                    skipinputuntilposition2.MediaBrowserCompatItemReceiver = i10;
                    i15 = i18;
                    i13 = Integer.MIN_VALUE;
                    i14 = i35;
                } else {
                    i11 = i2;
                    skipinputuntilposition2 = skipinputuntilposition3;
                    view = viewIconCompatParcelizer;
                    i12 = i34;
                    skipinputuntilposition2.AudioAttributesImplApi26Parcelizer++;
                    i13 = i25;
                    i14 = i28 + 1;
                    i15 = i36;
                }
                skipinputuntilposition2.AudioAttributesCompatParcelizer = (skipinputuntilposition2.AudioAttributesCompatParcelizer ? 1 : 0) | (flexItem.AudioAttributesCompatParcelizer() != BitmapDescriptorFactory.HUE_RED ? 1 : i35);
                skipinputuntilposition2.read = (skipinputuntilposition2.read ? 1 : 0) | (flexItem.write() != BitmapDescriptorFactory.HUE_RED ? 1 : i35);
                int[] iArr = this.IconCompatParcelizer;
                if (iArr != null) {
                    iArr[i10] = list3.size();
                }
                skipinputuntilposition2.RatingCompat += read(view, zMediaBrowserCompatMediaItem) + AudioAttributesCompatParcelizer(flexItem, zMediaBrowserCompatMediaItem) + read(flexItem, zMediaBrowserCompatMediaItem);
                skipinputuntilposition2.onCustomAction += flexItem.AudioAttributesCompatParcelizer();
                skipinputuntilposition2.onCommand += flexItem.write();
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(view, i10, i14, skipinputuntilposition2);
                int iMax = Math.max(i13, AudioAttributesCompatParcelizer(view, zMediaBrowserCompatMediaItem) + IconCompatParcelizer(flexItem, zMediaBrowserCompatMediaItem) + RemoteActionCompatParcelizer(flexItem, zMediaBrowserCompatMediaItem) + this.RemoteActionCompatParcelizer.IconCompatParcelizer(view));
                skipinputuntilposition2.write = Math.max(skipinputuntilposition2.write, iMax);
                if (zMediaBrowserCompatMediaItem) {
                    if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() != 2) {
                        skipinputuntilposition2.MediaBrowserCompatSearchResultReceiver = Math.max(skipinputuntilposition2.MediaBrowserCompatSearchResultReceiver, view.getBaseline() + flexItem.AudioAttributesImplApi21Parcelizer());
                    } else {
                        skipinputuntilposition2.MediaBrowserCompatSearchResultReceiver = Math.max(skipinputuntilposition2.MediaBrowserCompatSearchResultReceiver, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.AudioAttributesImplBaseParcelizer());
                    }
                }
                iAudioAttributesCompatParcelizer2 = i29;
                if (RemoteActionCompatParcelizer(i10, iAudioAttributesCompatParcelizer2, skipinputuntilposition2)) {
                    write(list3, skipinputuntilposition2, i10, i15);
                    i15 += skipinputuntilposition2.write;
                }
                i16 = i5;
                if (i16 != -1 && list3.size() > 0) {
                    if (list3.get(list3.size() - 1).AudioAttributesImplApi21Parcelizer >= i16 && i10 >= i16 && !z2) {
                        i15 = -skipinputuntilposition2.AudioAttributesCompatParcelizer();
                        i17 = i3;
                        z2 = true;
                    }
                    if (i15 <= i17 && z2) {
                        readVar2 = readVar;
                        i26 = iCombineMeasuredStates;
                        break;
                    }
                    i28 = i14;
                    i25 = iMax;
                    i27 = i15;
                    i26 = iCombineMeasuredStates;
                    i23 = i10 + 1;
                    i21 = i11;
                    i24 = i12;
                    arrayList = list3;
                    size = i6;
                    mode = i7;
                    i20 = i;
                }
                i17 = i3;
                if (i15 <= i17) {
                }
                i28 = i14;
                i25 = iMax;
                i27 = i15;
                i26 = iCombineMeasuredStates;
                i23 = i10 + 1;
                i21 = i11;
                i24 = i12;
                arrayList = list3;
                size = i6;
                mode = i7;
                i20 = i;
            }
            i12 = i24;
            i10 = i23;
            list3 = arrayList;
            i6 = size;
            i7 = mode;
            i11 = i21;
            i16 = i5;
            i23 = i10 + 1;
            i21 = i11;
            i24 = i12;
            arrayList = list3;
            size = i6;
            mode = i7;
            i20 = i;
        }
        readVar2.read = i26;
    }

    private static void read(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int iMediaDescriptionCompat = flexItem.MediaDescriptionCompat();
        int iRatingCompat = flexItem.RatingCompat();
        Drawable drawableIconCompatParcelizer = _methods.IconCompatParcelizer(compoundButton);
        int minimumWidth = drawableIconCompatParcelizer == null ? 0 : drawableIconCompatParcelizer.getMinimumWidth();
        int minimumHeight = drawableIconCompatParcelizer != null ? drawableIconCompatParcelizer.getMinimumHeight() : 0;
        if (iMediaDescriptionCompat == -1) {
            iMediaDescriptionCompat = minimumWidth;
        }
        flexItem.write(iMediaDescriptionCompat);
        if (iRatingCompat == -1) {
            iRatingCompat = minimumHeight;
        }
        flexItem.RemoteActionCompatParcelizer(iRatingCompat);
    }

    private int IconCompatParcelizer(boolean z) {
        if (z) {
            return this.RemoteActionCompatParcelizer.getPaddingStart();
        }
        return this.RemoteActionCompatParcelizer.getPaddingTop();
    }

    private int write(boolean z) {
        if (z) {
            return this.RemoteActionCompatParcelizer.getPaddingEnd();
        }
        return this.RemoteActionCompatParcelizer.getPaddingBottom();
    }

    private int read(boolean z) {
        if (z) {
            return this.RemoteActionCompatParcelizer.getPaddingTop();
        }
        return this.RemoteActionCompatParcelizer.getPaddingStart();
    }

    private int AudioAttributesCompatParcelizer(boolean z) {
        if (z) {
            return this.RemoteActionCompatParcelizer.getPaddingBottom();
        }
        return this.RemoteActionCompatParcelizer.getPaddingEnd();
    }

    private static int read(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int AudioAttributesCompatParcelizer(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private static int AudioAttributesImplApi21Parcelizer(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.MediaMetadataCompat();
        }
        return flexItem.read();
    }

    private static int write(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.read();
        }
        return flexItem.MediaMetadataCompat();
    }

    private static int AudioAttributesCompatParcelizer(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.MediaBrowserCompatCustomActionResultReceiver();
        }
        return flexItem.AudioAttributesImplApi21Parcelizer();
    }

    private static int read(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.AudioAttributesImplApi26Parcelizer();
        }
        return flexItem.AudioAttributesImplBaseParcelizer();
    }

    private static int IconCompatParcelizer(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.AudioAttributesImplApi21Parcelizer();
        }
        return flexItem.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static int RemoteActionCompatParcelizer(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.AudioAttributesImplBaseParcelizer();
        }
        return flexItem.AudioAttributesImplApi26Parcelizer();
    }

    private boolean AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() == 0) {
            return false;
        }
        if (flexItem.onCommand()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int iMediaBrowserCompatSearchResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
        if (iMediaBrowserCompatSearchResultReceiver != -1 && iMediaBrowserCompatSearchResultReceiver <= i7 + 1) {
            return false;
        }
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(view, i5, i6);
        if (iIconCompatParcelizer > 0) {
            i4 += iIconCompatParcelizer;
        }
        return i2 < i3 + i4;
    }

    private static boolean RemoteActionCompatParcelizer(int i, int i2, skipInputUntilPosition skipinputuntilposition) {
        return i == i2 - 1 && skipinputuntilposition.write() != 0;
    }

    private void write(List<skipInputUntilPosition> list, skipInputUntilPosition skipinputuntilposition, int i, int i2) {
        skipinputuntilposition.MediaMetadataCompat = i2;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(skipinputuntilposition);
        skipinputuntilposition.AudioAttributesImplApi21Parcelizer = i;
        list.add(skipinputuntilposition);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.MediaDescriptionCompat()
            r4 = 1
            if (r1 >= r3) goto L1a
            int r1 = r0.MediaDescriptionCompat()
            goto L24
        L1a:
            int r3 = r0.MediaBrowserCompatSearchResultReceiver()
            if (r1 <= r3) goto L26
            int r1 = r0.MediaBrowserCompatSearchResultReceiver()
        L24:
            r3 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r5 = r0.RatingCompat()
            if (r2 >= r5) goto L32
            int r2 = r0.RatingCompat()
            goto L3e
        L32:
            int r5 = r0.MediaBrowserCompatItemReceiver()
            if (r2 <= r5) goto L3d
            int r2 = r0.MediaBrowserCompatItemReceiver()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.RemoteActionCompatParcelizer(r8, r1, r0, r7)
            o.BinarySearchSeekerBinarySearchSeekMap r6 = r6.RemoteActionCompatParcelizer
            r6.AudioAttributesCompatParcelizer(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSeekable.write(android.view.View, int):void");
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        write(i, i2, 0);
    }

    public final void write(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        if (i3 < this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            int iIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (iIconCompatParcelizer2 == 0 || iIconCompatParcelizer2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
                int iAudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                if (mode != 1073741824) {
                    size = Math.min(iAudioAttributesImplBaseParcelizer, size);
                }
                paddingLeft = this.RemoteActionCompatParcelizer.getPaddingLeft();
                paddingRight = this.RemoteActionCompatParcelizer.getPaddingRight();
            } else if (iIconCompatParcelizer2 == 2 || iIconCompatParcelizer2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                size = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    size = this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                }
                paddingLeft = this.RemoteActionCompatParcelizer.getPaddingTop();
                paddingRight = this.RemoteActionCompatParcelizer.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(iIconCompatParcelizer)));
            }
            int i4 = size;
            int i5 = paddingLeft + paddingRight;
            int[] iArr = this.IconCompatParcelizer;
            List<skipInputUntilPosition> listMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            int size2 = listMediaBrowserCompatCustomActionResultReceiver.size();
            for (int i6 = iArr != null ? iArr[i3] : 0; i6 < size2; i6++) {
                skipInputUntilPosition skipinputuntilposition = listMediaBrowserCompatCustomActionResultReceiver.get(i6);
                if (skipinputuntilposition.RatingCompat < i4 && skipinputuntilposition.AudioAttributesCompatParcelizer) {
                    RemoteActionCompatParcelizer(i, i2, skipinputuntilposition, i4, i5, false);
                } else if (skipinputuntilposition.RatingCompat > i4 && skipinputuntilposition.read) {
                    write(i, i2, skipinputuntilposition, i4, i5, false);
                }
            }
        }
    }

    private void AudioAttributesImplApi21Parcelizer(int i) {
        boolean[] zArr = this.read;
        if (zArr == null) {
            this.read = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.read = new boolean[Math.max(zArr.length << 1, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void RemoteActionCompatParcelizer(int i, int i2, skipInputUntilPosition skipinputuntilposition, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        double d;
        double d2;
        float f = skipinputuntilposition.onCustomAction;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f <= BitmapDescriptorFactory.HUE_RED || i3 < skipinputuntilposition.RatingCompat) {
            return;
        }
        int i6 = skipinputuntilposition.RatingCompat;
        float f3 = (i3 - skipinputuntilposition.RatingCompat) / skipinputuntilposition.onCustomAction;
        skipinputuntilposition.RatingCompat = i4 + skipinputuntilposition.RemoteActionCompatParcelizer;
        if (!z) {
            skipinputuntilposition.write = Integer.MIN_VALUE;
        }
        int i7 = 0;
        float f4 = 0.0f;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < skipinputuntilposition.AudioAttributesImplApi26Parcelizer) {
            int i9 = skipinputuntilposition.MediaBrowserCompatItemReceiver + i7;
            View viewIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(i9);
            if (viewIconCompatParcelizer == null || viewIconCompatParcelizer.getVisibility() == 8) {
                i5 = i6;
            } else {
                FlexItem flexItem = (FlexItem) viewIconCompatParcelizer.getLayoutParams();
                int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 1) {
                    i5 = i6;
                    int measuredWidth = viewIconCompatParcelizer.getMeasuredWidth();
                    long[] jArr = this.write;
                    if (jArr != null) {
                        measuredWidth = read(jArr[i9]);
                    }
                    int measuredHeight = viewIconCompatParcelizer.getMeasuredHeight();
                    long[] jArr2 = this.write;
                    if (jArr2 != null) {
                        measuredHeight = RemoteActionCompatParcelizer(jArr2[i9]);
                    }
                    if (!this.read[i9] && flexItem.AudioAttributesCompatParcelizer() > BitmapDescriptorFactory.HUE_RED) {
                        float fAudioAttributesCompatParcelizer = measuredWidth + (flexItem.AudioAttributesCompatParcelizer() * f3);
                        if (i7 == skipinputuntilposition.AudioAttributesImplApi26Parcelizer - 1) {
                            fAudioAttributesCompatParcelizer += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fAudioAttributesCompatParcelizer);
                        if (iRound > flexItem.MediaBrowserCompatSearchResultReceiver()) {
                            iRound = flexItem.MediaBrowserCompatSearchResultReceiver();
                            this.read[i9] = true;
                            skipinputuntilposition.onCustomAction -= flexItem.AudioAttributesCompatParcelizer();
                            z2 = true;
                        } else {
                            f4 += fAudioAttributesCompatParcelizer - iRound;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2, flexItem, skipinputuntilposition.MediaMetadataCompat);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewIconCompatParcelizer.measure(iMakeMeasureSpec, iRemoteActionCompatParcelizer);
                        int measuredWidth2 = viewIconCompatParcelizer.getMeasuredWidth();
                        int measuredHeight2 = viewIconCompatParcelizer.getMeasuredHeight();
                        RemoteActionCompatParcelizer(i9, iMakeMeasureSpec, iRemoteActionCompatParcelizer, viewIconCompatParcelizer);
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i9, viewIconCompatParcelizer);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, measuredHeight + flexItem.AudioAttributesImplApi21Parcelizer() + flexItem.AudioAttributesImplBaseParcelizer() + this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewIconCompatParcelizer));
                    skipinputuntilposition.RatingCompat += measuredWidth + flexItem.MediaBrowserCompatCustomActionResultReceiver() + flexItem.AudioAttributesImplApi26Parcelizer();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewIconCompatParcelizer.getMeasuredHeight();
                    long[] jArr3 = this.write;
                    if (jArr3 != null) {
                        measuredHeight3 = RemoteActionCompatParcelizer(jArr3[i9]);
                    }
                    int measuredWidth3 = viewIconCompatParcelizer.getMeasuredWidth();
                    long[] jArr4 = this.write;
                    if (jArr4 != null) {
                        measuredWidth3 = read(jArr4[i9]);
                    }
                    if (this.read[i9] || flexItem.AudioAttributesCompatParcelizer() <= f2) {
                        i5 = i6;
                    } else {
                        float fAudioAttributesCompatParcelizer2 = measuredHeight3 + (flexItem.AudioAttributesCompatParcelizer() * f3);
                        if (i7 == skipinputuntilposition.AudioAttributesImplApi26Parcelizer - 1) {
                            fAudioAttributesCompatParcelizer2 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(fAudioAttributesCompatParcelizer2);
                        if (iRound2 > flexItem.MediaBrowserCompatItemReceiver()) {
                            iRound2 = flexItem.MediaBrowserCompatItemReceiver();
                            this.read[i9] = true;
                            skipinputuntilposition.onCustomAction -= flexItem.AudioAttributesCompatParcelizer();
                            i5 = i6;
                            z2 = true;
                        } else {
                            f4 += fAudioAttributesCompatParcelizer2 - iRound2;
                            i5 = i6;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int iWrite = write(i, flexItem, skipinputuntilposition.MediaMetadataCompat);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewIconCompatParcelizer.measure(iWrite, iMakeMeasureSpec2);
                        measuredWidth3 = viewIconCompatParcelizer.getMeasuredWidth();
                        int measuredHeight4 = viewIconCompatParcelizer.getMeasuredHeight();
                        RemoteActionCompatParcelizer(i9, iWrite, iMakeMeasureSpec2, viewIconCompatParcelizer);
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i9, viewIconCompatParcelizer);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, measuredWidth3 + flexItem.MediaBrowserCompatCustomActionResultReceiver() + flexItem.AudioAttributesImplApi26Parcelizer() + this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewIconCompatParcelizer));
                    skipinputuntilposition.RatingCompat += measuredHeight3 + flexItem.AudioAttributesImplApi21Parcelizer() + flexItem.AudioAttributesImplBaseParcelizer();
                }
                skipinputuntilposition.write = Math.max(skipinputuntilposition.write, iMax);
                i8 = iMax;
            }
            i7++;
            i6 = i5;
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        int i10 = i6;
        if (!z2 || i10 == skipinputuntilposition.RatingCompat) {
            return;
        }
        RemoteActionCompatParcelizer(i, i2, skipinputuntilposition, i3, i4, true);
    }

    private void write(int i, int i2, skipInputUntilPosition skipinputuntilposition, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = skipinputuntilposition.RatingCompat;
        float f2 = skipinputuntilposition.onCommand;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (f2 <= BitmapDescriptorFactory.HUE_RED || i3 > skipinputuntilposition.RatingCompat) {
            return;
        }
        float f4 = (skipinputuntilposition.RatingCompat - i3) / skipinputuntilposition.onCommand;
        skipinputuntilposition.RatingCompat = i4 + skipinputuntilposition.RemoteActionCompatParcelizer;
        if (!z) {
            skipinputuntilposition.write = Integer.MIN_VALUE;
        }
        int i6 = 0;
        float f5 = 0.0f;
        boolean z2 = false;
        int i7 = 0;
        while (i6 < skipinputuntilposition.AudioAttributesImplApi26Parcelizer) {
            int i8 = skipinputuntilposition.MediaBrowserCompatItemReceiver + i6;
            View viewIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(i8);
            if (viewIconCompatParcelizer == null || viewIconCompatParcelizer.getVisibility() == 8) {
                f = f4;
            } else {
                FlexItem flexItem = (FlexItem) viewIconCompatParcelizer.getLayoutParams();
                int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 1) {
                    int measuredWidth = viewIconCompatParcelizer.getMeasuredWidth();
                    long[] jArr = this.write;
                    if (jArr != null) {
                        measuredWidth = read(jArr[i8]);
                    }
                    int measuredHeight = viewIconCompatParcelizer.getMeasuredHeight();
                    long[] jArr2 = this.write;
                    if (jArr2 != null) {
                        measuredHeight = RemoteActionCompatParcelizer(jArr2[i8]);
                    }
                    if (!this.read[i8] && flexItem.write() > BitmapDescriptorFactory.HUE_RED) {
                        float fWrite = measuredWidth - (flexItem.write() * f4);
                        if (i6 == skipinputuntilposition.AudioAttributesImplApi26Parcelizer - 1) {
                            fWrite += f5;
                            f5 = 0.0f;
                        }
                        int iRound = Math.round(fWrite);
                        if (iRound < flexItem.MediaDescriptionCompat()) {
                            iRound = flexItem.MediaDescriptionCompat();
                            this.read[i8] = true;
                            skipinputuntilposition.onCommand -= flexItem.write();
                            z2 = true;
                        } else {
                            f5 += fWrite - iRound;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2, flexItem, skipinputuntilposition.MediaMetadataCompat);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewIconCompatParcelizer.measure(iMakeMeasureSpec, iRemoteActionCompatParcelizer);
                        int measuredWidth2 = viewIconCompatParcelizer.getMeasuredWidth();
                        int measuredHeight2 = viewIconCompatParcelizer.getMeasuredHeight();
                        RemoteActionCompatParcelizer(i8, iMakeMeasureSpec, iRemoteActionCompatParcelizer, viewIconCompatParcelizer);
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i8, viewIconCompatParcelizer);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    f = f4;
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.AudioAttributesImplApi21Parcelizer() + flexItem.AudioAttributesImplBaseParcelizer() + this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewIconCompatParcelizer));
                    skipinputuntilposition.RatingCompat += measuredWidth + flexItem.MediaBrowserCompatCustomActionResultReceiver() + flexItem.AudioAttributesImplApi26Parcelizer();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewIconCompatParcelizer.getMeasuredHeight();
                    long[] jArr3 = this.write;
                    if (jArr3 != null) {
                        measuredHeight3 = RemoteActionCompatParcelizer(jArr3[i8]);
                    }
                    int measuredWidth3 = viewIconCompatParcelizer.getMeasuredWidth();
                    long[] jArr4 = this.write;
                    if (jArr4 != null) {
                        measuredWidth3 = read(jArr4[i8]);
                    }
                    if (!this.read[i8] && flexItem.write() > f3) {
                        float fWrite2 = measuredHeight3 - (flexItem.write() * f4);
                        if (i6 == skipinputuntilposition.AudioAttributesImplApi26Parcelizer - 1) {
                            fWrite2 += f5;
                            f5 = f3;
                        }
                        int iRound2 = Math.round(fWrite2);
                        if (iRound2 < flexItem.RatingCompat()) {
                            iRound2 = flexItem.RatingCompat();
                            this.read[i8] = true;
                            skipinputuntilposition.onCommand -= flexItem.write();
                            z2 = true;
                        } else {
                            f5 += fWrite2 - iRound2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iWrite = write(i, flexItem, skipinputuntilposition.MediaMetadataCompat);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewIconCompatParcelizer.measure(iWrite, iMakeMeasureSpec2);
                        measuredWidth3 = viewIconCompatParcelizer.getMeasuredWidth();
                        int measuredHeight4 = viewIconCompatParcelizer.getMeasuredHeight();
                        RemoteActionCompatParcelizer(i8, iWrite, iMakeMeasureSpec2, viewIconCompatParcelizer);
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i8, viewIconCompatParcelizer);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.MediaBrowserCompatCustomActionResultReceiver() + flexItem.AudioAttributesImplApi26Parcelizer() + this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewIconCompatParcelizer));
                    skipinputuntilposition.RatingCompat += measuredHeight3 + flexItem.AudioAttributesImplApi21Parcelizer() + flexItem.AudioAttributesImplBaseParcelizer();
                    f = f4;
                }
                skipinputuntilposition.write = Math.max(skipinputuntilposition.write, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        if (!z2 || i5 == skipinputuntilposition.RatingCompat) {
            return;
        }
        write(i, i2, skipinputuntilposition, i3, i4, true);
    }

    private int write(int i, FlexItem flexItem, int i2) {
        BinarySearchSeekerBinarySearchSeekMap binarySearchSeekerBinarySearchSeekMap = this.RemoteActionCompatParcelizer;
        int paddingLeft = binarySearchSeekerBinarySearchSeekMap.getPaddingLeft();
        int paddingRight = this.RemoteActionCompatParcelizer.getPaddingRight();
        int iRemoteActionCompatParcelizer = binarySearchSeekerBinarySearchSeekMap.RemoteActionCompatParcelizer(i, paddingLeft + paddingRight + flexItem.MediaBrowserCompatCustomActionResultReceiver() + flexItem.AudioAttributesImplApi26Parcelizer() + i2, flexItem.MediaMetadataCompat());
        int size = View.MeasureSpec.getSize(iRemoteActionCompatParcelizer);
        if (size > flexItem.MediaBrowserCompatSearchResultReceiver()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.MediaBrowserCompatSearchResultReceiver(), View.MeasureSpec.getMode(iRemoteActionCompatParcelizer));
        }
        return size < flexItem.MediaDescriptionCompat() ? View.MeasureSpec.makeMeasureSpec(flexItem.MediaDescriptionCompat(), View.MeasureSpec.getMode(iRemoteActionCompatParcelizer)) : iRemoteActionCompatParcelizer;
    }

    private int RemoteActionCompatParcelizer(int i, FlexItem flexItem, int i2) {
        BinarySearchSeekerBinarySearchSeekMap binarySearchSeekerBinarySearchSeekMap = this.RemoteActionCompatParcelizer;
        int paddingTop = binarySearchSeekerBinarySearchSeekMap.getPaddingTop();
        int paddingBottom = this.RemoteActionCompatParcelizer.getPaddingBottom();
        int iWrite = binarySearchSeekerBinarySearchSeekMap.write(i, paddingTop + paddingBottom + flexItem.AudioAttributesImplApi21Parcelizer() + flexItem.AudioAttributesImplBaseParcelizer() + i2, flexItem.read());
        int size = View.MeasureSpec.getSize(iWrite);
        if (size > flexItem.MediaBrowserCompatItemReceiver()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.MediaBrowserCompatItemReceiver(), View.MeasureSpec.getMode(iWrite));
        }
        return size < flexItem.RatingCompat() ? View.MeasureSpec.makeMeasureSpec(flexItem.RatingCompat(), View.MeasureSpec.getMode(iWrite)) : iWrite;
    }

    public final void read(int i, int i2, int i3) {
        int mode;
        int size;
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (iIconCompatParcelizer == 2 || iIconCompatParcelizer == 3) {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(iIconCompatParcelizer)));
        }
        List<skipInputUntilPosition> listMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        if (mode == 1073741824) {
            int iMediaDescriptionCompat = this.RemoteActionCompatParcelizer.MediaDescriptionCompat() + i3;
            int i4 = 0;
            if (listMediaBrowserCompatCustomActionResultReceiver.size() == 1) {
                listMediaBrowserCompatCustomActionResultReceiver.get(0).write = size - i3;
                return;
            }
            if (listMediaBrowserCompatCustomActionResultReceiver.size() >= 2) {
                int iWrite = this.RemoteActionCompatParcelizer.write();
                if (iWrite == 1) {
                    skipInputUntilPosition skipinputuntilposition = new skipInputUntilPosition();
                    skipinputuntilposition.write = size - iMediaDescriptionCompat;
                    listMediaBrowserCompatCustomActionResultReceiver.add(0, skipinputuntilposition);
                    return;
                }
                if (iWrite == 2) {
                    this.RemoteActionCompatParcelizer.setFlexLines(write(listMediaBrowserCompatCustomActionResultReceiver, size, iMediaDescriptionCompat));
                    return;
                }
                if (iWrite == 3) {
                    if (iMediaDescriptionCompat < size) {
                        float size3 = (size - iMediaDescriptionCompat) / (listMediaBrowserCompatCustomActionResultReceiver.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = listMediaBrowserCompatCustomActionResultReceiver.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(listMediaBrowserCompatCustomActionResultReceiver.get(i4));
                            if (i4 != listMediaBrowserCompatCustomActionResultReceiver.size() - 1) {
                                skipInputUntilPosition skipinputuntilposition2 = new skipInputUntilPosition();
                                if (i4 == listMediaBrowserCompatCustomActionResultReceiver.size() - 2) {
                                    skipinputuntilposition2.write = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    skipinputuntilposition2.write = Math.round(size3);
                                }
                                f += size3 - skipinputuntilposition2.write;
                                if (f > 1.0f) {
                                    skipinputuntilposition2.write++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    skipinputuntilposition2.write--;
                                    f += 1.0f;
                                }
                                arrayList.add(skipinputuntilposition2);
                            }
                            i4++;
                        }
                        this.RemoteActionCompatParcelizer.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (iWrite == 4) {
                    if (iMediaDescriptionCompat >= size) {
                        this.RemoteActionCompatParcelizer.setFlexLines(write(listMediaBrowserCompatCustomActionResultReceiver, size, iMediaDescriptionCompat));
                        return;
                    }
                    int size5 = (size - iMediaDescriptionCompat) / (listMediaBrowserCompatCustomActionResultReceiver.size() << 1);
                    ArrayList arrayList2 = new ArrayList();
                    skipInputUntilPosition skipinputuntilposition3 = new skipInputUntilPosition();
                    skipinputuntilposition3.write = size5;
                    for (skipInputUntilPosition skipinputuntilposition4 : listMediaBrowserCompatCustomActionResultReceiver) {
                        arrayList2.add(skipinputuntilposition3);
                        arrayList2.add(skipinputuntilposition4);
                        arrayList2.add(skipinputuntilposition3);
                    }
                    this.RemoteActionCompatParcelizer.setFlexLines(arrayList2);
                    return;
                }
                if (iWrite != 5 || iMediaDescriptionCompat >= size) {
                    return;
                }
                float size6 = (size - iMediaDescriptionCompat) / listMediaBrowserCompatCustomActionResultReceiver.size();
                int size7 = listMediaBrowserCompatCustomActionResultReceiver.size();
                float f2 = 0.0f;
                while (i4 < size7) {
                    skipInputUntilPosition skipinputuntilposition5 = listMediaBrowserCompatCustomActionResultReceiver.get(i4);
                    float f3 = skipinputuntilposition5.write + size6;
                    if (i4 == listMediaBrowserCompatCustomActionResultReceiver.size() - 1) {
                        f3 += f2;
                        f2 = 0.0f;
                    }
                    int iRound = Math.round(f3);
                    f2 += f3 - iRound;
                    if (f2 > 1.0f) {
                        iRound++;
                        f2 -= 1.0f;
                    } else if (f2 < -1.0f) {
                        iRound--;
                        f2 += 1.0f;
                    }
                    skipinputuntilposition5.write = iRound;
                    i4++;
                }
            }
        }
    }

    private static List<skipInputUntilPosition> write(List<skipInputUntilPosition> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        skipInputUntilPosition skipinputuntilposition = new skipInputUntilPosition();
        skipinputuntilposition.write = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(skipinputuntilposition);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(skipinputuntilposition);
            }
        }
        return arrayList;
    }

    public final void IconCompatParcelizer() {
        IconCompatParcelizer(0);
    }

    public final void IconCompatParcelizer(int i) {
        View viewIconCompatParcelizer;
        if (i < this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == 4) {
                int[] iArr = this.IconCompatParcelizer;
                List<skipInputUntilPosition> listMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                int size = listMediaBrowserCompatCustomActionResultReceiver.size();
                for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                    skipInputUntilPosition skipinputuntilposition = listMediaBrowserCompatCustomActionResultReceiver.get(i2);
                    int i3 = skipinputuntilposition.AudioAttributesImplApi26Parcelizer;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = skipinputuntilposition.MediaBrowserCompatItemReceiver + i4;
                        if (i4 < this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() && (viewIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(i5)) != null && viewIconCompatParcelizer.getVisibility() != 8) {
                            FlexItem flexItem = (FlexItem) viewIconCompatParcelizer.getLayoutParams();
                            if (flexItem.RemoteActionCompatParcelizer() == -1 || flexItem.RemoteActionCompatParcelizer() == 4) {
                                if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 1) {
                                    AudioAttributesCompatParcelizer(viewIconCompatParcelizer, skipinputuntilposition.write, i5);
                                } else if (iIconCompatParcelizer == 2 || iIconCompatParcelizer == 3) {
                                    read(viewIconCompatParcelizer, skipinputuntilposition.write, i5);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(iIconCompatParcelizer)));
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (skipInputUntilPosition skipinputuntilposition2 : this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                for (Integer num : skipinputuntilposition2.MediaBrowserCompatCustomActionResultReceiver) {
                    View viewIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(num.intValue());
                    if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 1) {
                        AudioAttributesCompatParcelizer(viewIconCompatParcelizer2, skipinputuntilposition2.write, num.intValue());
                    } else if (iIconCompatParcelizer == 2 || iIconCompatParcelizer == 3) {
                        read(viewIconCompatParcelizer2, skipinputuntilposition2.write, num.intValue());
                    } else {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(iIconCompatParcelizer)));
                    }
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iAudioAttributesImplApi21Parcelizer = flexItem.AudioAttributesImplApi21Parcelizer();
        int iMin = Math.min(Math.max(((i - iAudioAttributesImplApi21Parcelizer) - flexItem.AudioAttributesImplBaseParcelizer()) - this.RemoteActionCompatParcelizer.IconCompatParcelizer(view), flexItem.RatingCompat()), flexItem.MediaBrowserCompatItemReceiver());
        long[] jArr = this.write;
        if (jArr != null) {
            measuredWidth = read(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        RemoteActionCompatParcelizer(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i2, view);
    }

    private void read(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMediaBrowserCompatCustomActionResultReceiver = flexItem.MediaBrowserCompatCustomActionResultReceiver();
        int iMin = Math.min(Math.max(((i - iMediaBrowserCompatCustomActionResultReceiver) - flexItem.AudioAttributesImplApi26Parcelizer()) - this.RemoteActionCompatParcelizer.IconCompatParcelizer(view), flexItem.MediaDescriptionCompat()), flexItem.MediaBrowserCompatSearchResultReceiver());
        long[] jArr = this.write;
        if (jArr != null) {
            measuredHeight = RemoteActionCompatParcelizer(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        RemoteActionCompatParcelizer(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i2, view);
    }

    public final void write(View view, skipInputUntilPosition skipinputuntilposition, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (flexItem.RemoteActionCompatParcelizer() != -1) {
            iRemoteActionCompatParcelizer = flexItem.RemoteActionCompatParcelizer();
        }
        int i5 = skipinputuntilposition.write;
        if (iRemoteActionCompatParcelizer != 0) {
            if (iRemoteActionCompatParcelizer == 1) {
                if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() != 2) {
                    int i6 = i2 + i5;
                    int measuredHeight = view.getMeasuredHeight();
                    view.layout(i, (i6 - measuredHeight) - flexItem.AudioAttributesImplBaseParcelizer(), i3, i6 - flexItem.AudioAttributesImplBaseParcelizer());
                    return;
                }
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, (i2 - i5) + measuredHeight2 + flexItem.AudioAttributesImplApi21Parcelizer(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.AudioAttributesImplApi21Parcelizer());
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                int measuredHeight3 = (((i5 - view.getMeasuredHeight()) + flexItem.AudioAttributesImplApi21Parcelizer()) - flexItem.AudioAttributesImplBaseParcelizer()) / 2;
                if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() != 2) {
                    int i7 = i2 + measuredHeight3;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight3;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (iRemoteActionCompatParcelizer == 3) {
                if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() != 2) {
                    int iMax = Math.max(skipinputuntilposition.MediaBrowserCompatSearchResultReceiver - view.getBaseline(), flexItem.AudioAttributesImplApi21Parcelizer());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                }
                int iMax2 = Math.max((skipinputuntilposition.MediaBrowserCompatSearchResultReceiver - view.getMeasuredHeight()) + view.getBaseline(), flexItem.AudioAttributesImplBaseParcelizer());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
            if (iRemoteActionCompatParcelizer != 4) {
                return;
            }
        }
        if (this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() != 2) {
            view.layout(i, i2 + flexItem.AudioAttributesImplApi21Parcelizer(), i3, i4 + flexItem.AudioAttributesImplApi21Parcelizer());
        } else {
            view.layout(i, i2 - flexItem.AudioAttributesImplBaseParcelizer(), i3, i4 - flexItem.AudioAttributesImplBaseParcelizer());
        }
    }

    public final void write(View view, skipInputUntilPosition skipinputuntilposition, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (flexItem.RemoteActionCompatParcelizer() != -1) {
            iRemoteActionCompatParcelizer = flexItem.RemoteActionCompatParcelizer();
        }
        int i5 = skipinputuntilposition.write;
        if (iRemoteActionCompatParcelizer != 0) {
            if (iRemoteActionCompatParcelizer == 1) {
                if (!z) {
                    int measuredWidth = view.getMeasuredWidth();
                    view.layout(((i + i5) - measuredWidth) - flexItem.AudioAttributesImplApi26Parcelizer(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.AudioAttributesImplApi26Parcelizer(), i4);
                    return;
                }
                int measuredWidth2 = view.getMeasuredWidth();
                view.layout((i - i5) + measuredWidth2 + flexItem.MediaBrowserCompatCustomActionResultReceiver(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.MediaBrowserCompatCustomActionResultReceiver(), i4);
                return;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth3 = (((i5 - view.getMeasuredWidth()) + mapArray.write(marginLayoutParams)) - mapArray.RemoteActionCompatParcelizer(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth3, i2, i3 + measuredWidth3, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth3, i2, i3 - measuredWidth3, i4);
                    return;
                }
            }
            if (iRemoteActionCompatParcelizer != 3 && iRemoteActionCompatParcelizer != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.MediaBrowserCompatCustomActionResultReceiver(), i2, i3 + flexItem.MediaBrowserCompatCustomActionResultReceiver(), i4);
        } else {
            view.layout(i - flexItem.AudioAttributesImplApi26Parcelizer(), i2, i3 - flexItem.AudioAttributesImplApi26Parcelizer(), i4);
        }
    }

    public final void write(int i) {
        long[] jArr = this.write;
        if (jArr == null) {
            this.write = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.write = Arrays.copyOf(this.write, Math.max(jArr.length << 1, i));
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        long[] jArr = this.AudioAttributesCompatParcelizer;
        if (jArr == null) {
            this.AudioAttributesCompatParcelizer = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.AudioAttributesCompatParcelizer = Arrays.copyOf(this.AudioAttributesCompatParcelizer, Math.max(jArr.length << 1, i));
        }
    }

    private void RemoteActionCompatParcelizer(int i, int i2, int i3, View view) {
        long[] jArr = this.AudioAttributesCompatParcelizer;
        if (jArr != null) {
            jArr[i] = write(i2, i3);
        }
        long[] jArr2 = this.write;
        if (jArr2 != null) {
            jArr2[i] = write(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void read(int i) {
        int[] iArr = this.IconCompatParcelizer;
        if (iArr == null) {
            this.IconCompatParcelizer = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, Math.max(iArr.length << 1, i));
        }
    }

    public final void IconCompatParcelizer(List<skipInputUntilPosition> list, int i) {
        int i2 = this.IconCompatParcelizer[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.IconCompatParcelizer;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.AudioAttributesCompatParcelizer;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    static class RemoteActionCompatParcelizer implements Comparable<RemoteActionCompatParcelizer> {
        int AudioAttributesCompatParcelizer;
        int read;

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            int i = this.read;
            int i2 = remoteActionCompatParcelizer.read;
            return i != i2 ? i - i2 : this.AudioAttributesCompatParcelizer - remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.read);
            sb.append(", index=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class read {
        public List<skipInputUntilPosition> RemoteActionCompatParcelizer;
        public int read;

        public final void RemoteActionCompatParcelizer() {
            this.RemoteActionCompatParcelizer = null;
            this.read = 0;
        }
    }
}
