package in.juspay.widget.qrscanner.com.google.zxing.client.android.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.ResponseError;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.ThemeAlphaConstantsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraConfigurationUtils {
    private static final Pattern a = Pattern.compile(";");

    private CameraConfigurationUtils() {
    }

    private static Integer a(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Objects.toString(zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            return null;
        }
        double d2 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double dAbs = Math.abs(((double) zoomRatios.get(i2).intValue()) - (100.0d * d));
            if (dAbs < d2) {
                i = i2;
                d2 = dAbs;
            }
        }
        zoomRatios.get(i).intValue();
        return Integer.valueOf(i);
    }

    private static String a(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    private static String a(String str, Collection<String> collection, String... strArr) {
        Arrays.toString(strArr);
        Objects.toString(collection);
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                return str2;
            }
        }
        return null;
    }

    private static String a(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private static List<Camera.Area> a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append("\nBRAND=");
        sb.append(Build.BRAND);
        sb.append("\nCPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append("\nDEVICE=");
        sb.append(Build.DEVICE);
        sb.append("\nDISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append("\nFINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append("\nHOST=");
        sb.append(Build.HOST);
        sb.append("\nID=");
        sb.append(Build.ID);
        sb.append("\nMANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append("\nMODEL=");
        sb.append(Build.MODEL);
        sb.append("\nPRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append("\nTAGS=");
        sb.append(Build.TAGS);
        sb.append("\nTIME=");
        sb.append(Build.TIME);
        sb.append("\nTYPE=");
        sb.append(Build.TYPE);
        sb.append("\nUSER=");
        sb.append(Build.USER);
        sb.append("\nVERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append("\nVERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append("\nVERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\nVERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] strArrSplit = a.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        String strA;
        if ("barcode".equals(parameters.getSceneMode()) || (strA = a("scene mode", parameters.getSupportedSceneModes(), "barcode")) == null) {
            return;
        }
        parameters.setSceneMode(strA);
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            return;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        if (exposureCompensationStep > BitmapDescriptorFactory.HUE_RED) {
            if (!z) {
                f = 1.5f;
            }
            int iMax = Math.max(Math.min(Math.round(f / exposureCompensationStep), maxExposureCompensation), minExposureCompensation);
            if (parameters.getExposureCompensation() == iMax) {
                return;
            }
            parameters.setExposureCompensation(iMax);
        }
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i, int i2) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        a((Collection<int[]>) supportedPreviewFpsRange);
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i3 = next[0];
            int i4 = next[1];
            if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                break;
            }
        }
        if (next == null) {
            return;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        boolean zEquals = Arrays.equals(iArr, next);
        Arrays.toString(next);
        if (zEquals) {
            return;
        }
        parameters.setPreviewFpsRange(next[0], next[1]);
    }

    public static void setFocus(Camera.Parameters parameters, d.a aVar, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String strA = (z || aVar == d.a.AUTO) ? a("focus mode", supportedFocusModes, TtmlNode.TEXT_EMPHASIS_AUTO) : aVar == d.a.CONTINUOUS ? a("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", TtmlNode.TEXT_EMPHASIS_AUTO) : aVar == d.a.INFINITY ? a("focus mode", supportedFocusModes, "infinity") : aVar == d.a.MACRO ? a("focus mode", supportedFocusModes, "macro") : null;
        if (!z && strA == null) {
            strA = a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strA == null || strA.equals(parameters.getFocusMode())) {
            return;
        }
        parameters.setFocusMode(strA);
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            a((Iterable<Camera.Area>) parameters.getFocusAreas());
            List<Camera.Area> listA = a(ResponseError.NO_INTERNET_ERROR);
            a((Iterable<Camera.Area>) listA);
            parameters.setFocusAreas(listA);
        }
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        String strA;
        if ("negative".equals(parameters.getColorEffect()) || (strA = a("color effect", parameters.getSupportedColorEffects(), "negative")) == null) {
            return;
        }
        parameters.setColorEffect(strA);
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Objects.toString(parameters.getMeteringAreas());
            List<Camera.Area> listA = a(ResponseError.NO_INTERNET_ERROR);
            a((Iterable<Camera.Area>) listA);
            parameters.setMeteringAreas(listA);
        }
    }

    public static void setTorch(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strA = z ? a("flash mode", supportedFlashModes, "torch", "on") : a("flash mode", supportedFlashModes, "off");
        if (strA == null || strA.equals(parameters.getFlashMode())) {
            return;
        }
        parameters.setFlashMode(strA);
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported() || parameters.getVideoStabilization()) {
            return;
        }
        parameters.setVideoStabilization(true);
    }

    public static void setZoom(Camera.Parameters parameters, double d) {
        Integer numA;
        if (!parameters.isZoomSupported() || (numA = a(parameters, d)) == null) {
            return;
        }
        int zoom = parameters.getZoom();
        int iIntValue = numA.intValue();
        Objects.toString(numA);
        if (zoom == iIntValue) {
            return;
        }
        parameters.setZoom(numA.intValue());
    }
}
