package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getBeanClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001ai\u0010\u000b\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n28\b\u0004\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00050\u000fH\u0082\b\u001a&\u0010\u0014\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a&\u0010\u0015\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\"\u000e\u0010\u0016\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"addPathNodes", "", "", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "args", "", "count", "", "pathNodesFromArgs", "", "numArgs", "nodeFor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "subArray", TtmlNode.START, "pathMoveNodeFromArgs", "pathRelativeMoveNodeFromArgs", "RelativeCloseKey", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findMethod {
    public static final void write(char c, ArrayList<getBeanClass> arrayList, float[] fArr, int i) {
        int i2 = 0;
        switch (c) {
            case 'A':
                ArrayList<getBeanClass> arrayList2 = arrayList;
                for (int i3 = 0; i3 <= i - 7; i3 += 7) {
                    arrayList2.add(new getBeanClass.AudioAttributesCompatParcelizer(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], Float.compare(fArr[i3 + 3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(fArr[i3 + 4], BitmapDescriptorFactory.HUE_RED) != 0, fArr[i3 + 5], fArr[i3 + 6]));
                }
                return;
            case 'C':
                ArrayList<getBeanClass> arrayList3 = arrayList;
                while (i2 <= i - 6) {
                    arrayList3.add(new getBeanClass.write(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'H':
                ArrayList<getBeanClass> arrayList4 = arrayList;
                while (i2 <= i - 1) {
                    arrayList4.add(new getBeanClass.IconCompatParcelizer(fArr[i2]));
                    i2++;
                }
                return;
            case 'L':
                ArrayList<getBeanClass> arrayList5 = arrayList;
                while (i2 <= i - 2) {
                    arrayList5.add(new getBeanClass.RemoteActionCompatParcelizer(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'M':
                write(arrayList, fArr, i);
                return;
            case 'Q':
                ArrayList<getBeanClass> arrayList6 = arrayList;
                while (i2 <= i - 4) {
                    arrayList6.add(new getBeanClass.AudioAttributesImplBaseParcelizer(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'S':
                ArrayList<getBeanClass> arrayList7 = arrayList;
                while (i2 <= i - 4) {
                    arrayList7.add(new getBeanClass.MediaBrowserCompatItemReceiver(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'T':
                ArrayList<getBeanClass> arrayList8 = arrayList;
                while (i2 <= i - 2) {
                    arrayList8.add(new getBeanClass.AudioAttributesImplApi26Parcelizer(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'V':
                ArrayList<getBeanClass> arrayList9 = arrayList;
                while (i2 <= i - 1) {
                    arrayList9.add(new getBeanClass.onAddQueueItem(fArr[i2]));
                    i2++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(getBeanClass.read.INSTANCE);
                return;
            case 'a':
                ArrayList<getBeanClass> arrayList10 = arrayList;
                for (int i4 = 0; i4 <= i - 7; i4 += 7) {
                    arrayList10.add(new getBeanClass.MediaBrowserCompatCustomActionResultReceiver(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], Float.compare(fArr[i4 + 3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(fArr[i4 + 4], BitmapDescriptorFactory.HUE_RED) != 0, fArr[i4 + 5], fArr[i4 + 6]));
                }
                return;
            case 'c':
                ArrayList<getBeanClass> arrayList11 = arrayList;
                while (i2 <= i - 6) {
                    arrayList11.add(new getBeanClass.MediaDescriptionCompat(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'h':
                ArrayList<getBeanClass> arrayList12 = arrayList;
                while (i2 <= i - 1) {
                    arrayList12.add(new getBeanClass.RatingCompat(fArr[i2]));
                    i2++;
                }
                return;
            case 'l':
                ArrayList<getBeanClass> arrayList13 = arrayList;
                while (i2 <= i - 2) {
                    arrayList13.add(new getBeanClass.MediaBrowserCompatSearchResultReceiver(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'm':
                read(arrayList, fArr, i);
                return;
            case 'q':
                ArrayList<getBeanClass> arrayList14 = arrayList;
                while (i2 <= i - 4) {
                    arrayList14.add(new getBeanClass.MediaMetadataCompat(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 's':
                ArrayList<getBeanClass> arrayList15 = arrayList;
                while (i2 <= i - 4) {
                    arrayList15.add(new getBeanClass.onCommand(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 't':
                ArrayList<getBeanClass> arrayList16 = arrayList;
                while (i2 <= i - 2) {
                    arrayList16.add(new getBeanClass.handleMediaPlayPauseIfPendingOnHandler(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'v':
                ArrayList<getBeanClass> arrayList17 = arrayList;
                while (i2 <= i - 1) {
                    arrayList17.add(new getBeanClass.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(fArr[i2]));
                    i2++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: ".concat(String.valueOf(c)));
        }
    }

    private static final void write(List<getBeanClass> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new getBeanClass.AudioAttributesImplApi21Parcelizer(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new getBeanClass.RemoteActionCompatParcelizer(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void read(List<getBeanClass> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new getBeanClass.MediaBrowserCompatMediaItem(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new getBeanClass.MediaBrowserCompatSearchResultReceiver(fArr[i3], fArr[i3 + 1]));
            }
        }
    }
}
