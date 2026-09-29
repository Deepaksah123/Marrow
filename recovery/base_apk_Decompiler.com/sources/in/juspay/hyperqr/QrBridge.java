package in.juspay.hyperqr;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import com.google.mlkit.vision.common.InputImage;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.FragmentHooks;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.ResultAwaitingDuiHook;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat;
import in.juspay.widget.qrscanner.com.google.zxing.BinaryBitmap;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.EncodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.MultiFormatReader;
import in.juspay.widget.qrscanner.com.google.zxing.RGBLuminanceSource;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import in.juspay.widget.qrscanner.com.google.zxing.common.HybridBinarizer;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.QRCodeWriter;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeCallback;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeResult;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.CaptureManager;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.VideoTimelineResponseBody;
import kotlin._isNaN;
import kotlin.getSubmissionTimestamp;
import kotlin.hasGetter;
import kotlin.setAction;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 =2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ=\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\u0006\u0010\r\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ!\u0010!\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020 2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J5\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J5\u0010,\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b,\u0010&J#\u0010-\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b-\u0010\u001aJ\u000f\u0010.\u001a\u00020\u0010H\u0007¢\u0006\u0004\b.\u0010$R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\bR \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020:098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Lin/juspay/hyperqr/QrBridge;", "Lin/juspay/hyper/bridge/HyperBridge;", "Lin/juspay/hyper/core/BridgeComponents;", "p0", "<init>", "(Lin/juspay/hyper/core/BridgeComponents;)V", "", "checkFirebaseScanner", "()Z", "checkQRScannerLibrary", "", "p1", "", "p2", "p3", "p4", "", "generateQRCode", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "makeFailureData", "(Ljava/lang/String;)Ljava/lang/String;", "makeSuccessData", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)Z", "onNullParam", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "onRequestPermissionResult", "(I[Ljava/lang/String;[I)Z", "openQRScanner", "Landroid/graphics/Bitmap;", "readQRFromBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", CourseConfigKeyConstantsKt.KEY_RESET, "()V", "saveImage", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "scanQRFromGallery", "(Ljava/lang/String;)V", "Landroid/view/View;", "screenShot", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "shareImage", "startQRScanner", "stopScanning", "Lin/juspay/widget/qrscanner/com/journeyapps/barcodescanner/CaptureManager;", "captureManager", "Lin/juspay/widget/qrscanner/com/journeyapps/barcodescanner/CaptureManager;", "Lin/juspay/hyperqr/CameraStreamScanner;", "firebaseScanner", "Lin/juspay/hyperqr/CameraStreamScanner;", "Lin/juspay/hyperqr/InputImageScanner;", "imageScanner", "Lin/juspay/hyperqr/InputImageScanner;", "isPermissionGranted", "", "", "listenerMap", "Ljava/util/Map;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QrBridge extends HyperBridge {
    public static final String GALLERY = "GALLERY";
    private static final int GALLERY_KITKAT_INTENT_CALLED = 118;
    private static final String LOG_TAG = "QRBridge";
    public static final String REQUEST_PERMISSION_PREFIX = "ReqPermi";
    private static final int SELECT_PHOTO = 117;
    private CaptureManager captureManager;
    private CameraStreamScanner firebaseScanner;
    private InputImageScanner imageScanner;
    private final Map<String, Object> listenerMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrBridge(BridgeComponents bridgeComponents) {
        super(bridgeComponents);
        toMagicModuleMetaRepoModel.write(bridgeComponents, "");
        this.listenerMap = new HashMap();
    }

    @JavascriptInterface
    public final void scanQRFromGallery(final String p0) {
        this.listenerMap.put(GALLERY, new ResultAwaitingDuiHook() { // from class: in.juspay.hyperqr.QrBridge$$ExternalSyntheticLambda0
            @Override // in.juspay.hyper.core.ResultAwaitingDuiHook
            public final boolean onActivityResult(int i, int i2, Intent intent) {
                return QrBridge.scanQRFromGallery$lambda$1(this.f$0, p0, i, i2, intent);
            }
        });
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        getBridgeComponents().getFragmentHooks().startActivityForResult(intent, 118, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean scanQRFromGallery$lambda$1(QrBridge qrBridge, String str, int i, int i2, Intent intent) {
        toMagicModuleMetaRepoModel.write(qrBridge, "");
        try {
        } catch (Exception e) {
            JuspayLogger.d(LOG_TAG, "Exception in scanning the QR code :".concat(String.valueOf(e)));
            return false;
        }
        if (intent == null) {
            CallbackInvoker callbackInvoker = qrBridge.getBridgeComponents().getCallbackInvoker();
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            byte[] bytes = "NO IMAGE SELECTED".getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            String str2 = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes, 2)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            callbackInvoker.invokeCallbackInDUIWebview(str, str2);
            return false;
        }
        if (118 != i && 117 != i) {
            return false;
        }
        if (qrBridge.checkFirebaseScanner()) {
            try {
                Uri data = intent.getData();
                if (data != null) {
                    InputImage inputImageFromFilePath = InputImage.fromFilePath(qrBridge.getBridgeComponents().getContext(), data);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputImageFromFilePath, "");
                    InputImageScanner inputImageScanner = new InputImageScanner(new QrBridge$scanQRFromGallery$1$1(qrBridge, str), new QrBridge$scanQRFromGallery$1$2(qrBridge, str));
                    qrBridge.imageScanner = inputImageScanner;
                    inputImageScanner.scanImage(inputImageFromFilePath);
                } else {
                    qrBridge.getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(str, qrBridge.makeFailureData("Selected image uri is null"));
                }
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        InputStream inputStreamOpenInputStream = null;
        try {
            Uri data2 = intent.getData();
            if (data2 != null) {
                inputStreamOpenInputStream = qrBridge.getBridgeComponents().getContext().getContentResolver().openInputStream(data2);
            }
        } catch (FileNotFoundException e3) {
            StringBuilder sb = new StringBuilder("Exception in scanning the QR code :");
            sb.append(e3);
            JuspayLogger.d(LOG_TAG, sb.toString());
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(inputStreamOpenInputStream));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmapDecodeStream, "");
        qrBridge.readQRFromBitmap(bitmapDecodeStream, str);
        qrBridge.listenerMap.remove(GALLERY);
        return true;
        JuspayLogger.d(LOG_TAG, "Exception in scanning the QR code :".concat(String.valueOf(e)));
        return false;
    }

    private final void readQRFromBitmap(Bitmap p0, String p1) {
        try {
            int[] iArr = new int[p0.getWidth() * p0.getHeight()];
            p0.getPixels(iArr, 0, p0.getWidth(), 0, 0, p0.getWidth(), p0.getHeight());
            String text = new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new RGBLuminanceSource(p0.getWidth(), p0.getHeight(), iArr))), VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(DecodeHintType.TRY_HARDER, Boolean.TRUE), setAction.write(DecodeHintType.ALSO_INVERTED, Boolean.TRUE))).getText();
            StringBuilder sb = new StringBuilder("Scanned QR Result: ");
            sb.append(text);
            JuspayLogger.d(LOG_TAG, sb.toString());
            CallbackInvoker callbackInvoker = getBridgeComponents().getCallbackInvoker();
            String strEncode = URLEncoder.encode(text, CharsetNames.UTF_8);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncode, "");
            callbackInvoker.invokeCallbackInDUIWebview(p1, makeSuccessData(TestGroupLSModel.read(strEncode, "+", "%20", false)));
        } catch (Exception e) {
            CallbackInvoker callbackInvoker2 = getBridgeComponents().getCallbackInvoker();
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            byte[] bytes = "unknown_error::".concat(String.valueOf(e)).getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            String str = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes, 2)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            callbackInvoker2.invokeCallbackInDUIWebview(p1, str);
        }
    }

    @JavascriptInterface
    public final void shareImage(int p0, String p1, String p2, String p3) {
        Activity activity = getBridgeComponents().getActivity();
        if (activity != null) {
            try {
                View viewFindViewById = activity.findViewById(p0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
                Uri uri = Uri.parse(MediaStore.Images.Media.insertImage(getBridgeComponents().getContext().getContentResolver(), screenShot(viewFindViewById), p2, p1));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.SUBJECT", p1);
                intent.putExtra("android.intent.extra.TEXT", p2);
                intent.putExtra("android.intent.extra.STREAM", uri);
                FragmentHooks fragmentHooks = getBridgeComponents().getFragmentHooks();
                Intent intentCreateChooser = Intent.createChooser(intent, p3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentCreateChooser, "");
                fragmentHooks.startActivityForResult(intentCreateChooser, -1, null);
            } catch (Exception e) {
                JuspayLogger.d(LOG_TAG, "Exception in share qr :".concat(String.valueOf(e)));
            }
        }
    }

    @JavascriptInterface
    public final void saveImage(int p0, String p1, String p2, String p3) {
        Activity activity = getBridgeComponents().getActivity();
        if (activity != null) {
            try {
                View viewFindViewById = activity.findViewById(p0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
                String strInsertImage = MediaStore.Images.Media.insertImage(getBridgeComponents().getContext().getContentResolver(), screenShot(viewFindViewById), p1, p2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", "false");
                jSONObject.put("data", strInsertImage);
                getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(p3, jSONObject.toString());
            } catch (Exception e) {
                JuspayLogger.d(LOG_TAG, "Exception in download qr :".concat(String.valueOf(e)));
                CallbackInvoker callbackInvoker = getBridgeComponents().getCallbackInvoker();
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                byte[] bytes = "unknown_error::".concat(String.valueOf(e)).getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
                String str = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes, 2)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                callbackInvoker.invokeCallbackInDUIWebview(p3, str);
            }
        }
    }

    private final Bitmap screenShot(View p0) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), Bitmap.Config.ARGB_8888);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmapCreateBitmap, "");
        p0.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String makeSuccessData(String p0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", "false");
        jSONObject.put("data", p0);
        String string = jSONObject.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String makeFailureData(String p0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", "true");
        jSONObject.put("data", p0);
        String string = jSONObject.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final void openQRScanner(String p0, final String p1) {
        if (getBridgeComponents().getActivity() != null && !TextUtils.isEmpty(p0)) {
            final int i = Integer.parseInt(p0);
            JuspayLogger.d(LOG_TAG, "Opening QR Scanner inside Frame with ID :".concat(String.valueOf(i)));
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hyperqr.QrBridge$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    QrBridge.openQRScanner$lambda$2(this.f$0, i, p1);
                }
            });
            return;
        }
        JuspayLogger.e(LOG_TAG, "ERROR: Frame ID null!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openQRScanner$lambda$2(final QrBridge qrBridge, int i, final String str) {
        toMagicModuleMetaRepoModel.write(qrBridge, "");
        Activity activity = qrBridge.getBridgeComponents().getActivity();
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(i);
            if (viewGroup == null) {
                StringBuilder sb = new StringBuilder("Couldn't find view for frameId: ");
                sb.append(i);
                sb.append('.');
                JuspayLogger.e(LOG_TAG, sb.toString());
                qrBridge.getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(str, qrBridge.makeFailureData("bad_view_id"));
                return;
            }
            if (qrBridge.checkFirebaseScanner()) {
                JuspayLogger.d(LOG_TAG, "Using Firebase Scanner");
                Context context = qrBridge.getBridgeComponents().getContext();
                ComponentCallbacks2 activity2 = qrBridge.getBridgeComponents().getActivity();
                toMagicModuleMetaRepoModel.read(activity2, "");
                CameraStreamScanner cameraStreamScanner = new CameraStreamScanner(viewGroup, (hasGetter) activity2, context, new QrBridge$openQRScanner$1$1(qrBridge, str));
                qrBridge.firebaseScanner = cameraStreamScanner;
                cameraStreamScanner.scanWithCamera();
                return;
            }
            JuspayLogger.d(LOG_TAG, "Using Zxing Scanner");
            DecoratedBarcodeView decoratedBarcodeView = new DecoratedBarcodeView(qrBridge.getBridgeComponents().getActivity());
            decoratedBarcodeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(decoratedBarcodeView);
            CaptureManager captureManager = new CaptureManager(activity, decoratedBarcodeView);
            qrBridge.captureManager = captureManager;
            captureManager.setBarcodeCallBack(new BarcodeCallback() { // from class: in.juspay.hyperqr.QrBridge$openQRScanner$1$2
                @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeCallback
                public final void barcodeResult(BarcodeResult p0) {
                    toMagicModuleMetaRepoModel.write(p0, "");
                    try {
                        StringBuilder sb2 = new StringBuilder("Scanned QR Result: ");
                        sb2.append(p0);
                        JuspayLogger.d("QRBridge", sb2.toString());
                        CallbackInvoker callbackInvoker = this.this$0.getBridgeComponents().getCallbackInvoker();
                        String str2 = str;
                        QrBridge qrBridge2 = this.this$0;
                        String string = p0.toString();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        byte[] bytes = string.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
                        String strEncodeToString = Base64.encodeToString(bytes, 2);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncodeToString, "");
                        callbackInvoker.invokeCallbackInDUIWebview(str2, qrBridge2.makeSuccessData(strEncodeToString));
                    } catch (Exception unused) {
                        CallbackInvoker callbackInvoker2 = this.this$0.getBridgeComponents().getCallbackInvoker();
                        String str3 = str;
                        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                        byte[] bytes2 = "unknown_error".getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes2, "");
                        String str4 = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes2, 2)}, 1));
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                        callbackInvoker2.invokeCallbackInDUIWebview(str3, str4);
                    }
                }

                @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeCallback
                public final void possibleResultPoints(List<? extends ResultPoint> p0) {
                    toMagicModuleMetaRepoModel.write(p0, "");
                }
            });
            CaptureManager captureManager2 = qrBridge.captureManager;
            if (captureManager2 != null) {
                captureManager2.onResume();
            }
            CaptureManager captureManager3 = qrBridge.captureManager;
            if (captureManager3 != null) {
                captureManager3.decode();
            }
        }
    }

    private final boolean isPermissionGranted() {
        return _isNaN.checkSelfPermission(getBridgeComponents().getContext(), "android.permission.CAMERA") == 0;
    }

    @JavascriptInterface
    public final void startQRScanner(final String p0, final String p1) {
        if (p0 == null) {
            onNullParam("parentId", p1);
        } else if (isPermissionGranted()) {
            openQRScanner(p0, p1);
        } else {
            getBridgeComponents().getFragmentHooks().requestPermission(new String[]{"android.permission.CAMERA"}, 101);
            this.listenerMap.put("ReqPermi101", new Handler.Callback() { // from class: in.juspay.hyperqr.QrBridge$$ExternalSyntheticLambda1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return QrBridge.startQRScanner$lambda$3(this.f$0, p0, p1, message);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startQRScanner$lambda$3(QrBridge qrBridge, String str, String str2, Message message) {
        toMagicModuleMetaRepoModel.write(qrBridge, "");
        toMagicModuleMetaRepoModel.write(message, "");
        if (qrBridge.isPermissionGranted()) {
            qrBridge.openQRScanner(str, str2);
            return false;
        }
        CallbackInvoker callbackInvoker = qrBridge.getBridgeComponents().getCallbackInvoker();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        byte[] bytes = "permission_denied".getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        String str3 = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes, 2)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        callbackInvoker.invokeCallbackInDUIWebview(str2, str3);
        return false;
    }

    @JavascriptInterface
    public final void stopScanning() {
        CameraStreamScanner cameraStreamScanner = this.firebaseScanner;
        if (cameraStreamScanner != null) {
            cameraStreamScanner.releaseCameraResources();
        }
        InputImageScanner inputImageScanner = this.imageScanner;
        if (inputImageScanner != null) {
            inputImageScanner.releaseResources();
        }
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hyperqr.QrBridge$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                QrBridge.stopScanning$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopScanning$lambda$5(QrBridge qrBridge) {
        toMagicModuleMetaRepoModel.write(qrBridge, "");
        CaptureManager captureManager = qrBridge.captureManager;
        if (captureManager != null) {
            captureManager.onPause();
            captureManager.onDestroy();
            qrBridge.captureManager = null;
        }
    }

    @JavascriptInterface
    public final void generateQRCode(String p0, String p1, int p2, int p3, final String p4) {
        if (p0 == null) {
            onNullParam("data", p4);
            return;
        }
        if (p1 == null) {
            onNullParam("parent", p4);
            return;
        }
        try {
            int i = Integer.parseInt(p1);
            Activity activity = getBridgeComponents().getActivity();
            if (activity == null) {
                return;
            }
            View viewFindViewById = activity.findViewById(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            final ImageView imageView = (ImageView) viewFindViewById;
            final BitMatrix bitMatrixEncode = new QRCodeWriter().encode(p0, BarcodeFormat.QR_CODE, p2, p2, VideoTimelineResponseBody.read(setAction.write(EncodeHintType.MARGIN, Integer.valueOf(p3))));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitMatrixEncode, "");
            final int width = bitMatrixEncode.getWidth();
            final int height = bitMatrixEncode.getHeight();
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hyperqr.QrBridge$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    QrBridge.generateQRCode$lambda$6(imageView, width, height, bitMatrixEncode, this, p4);
                }
            });
        } catch (Exception e) {
            getBridgeComponents().getTrackerInterface().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while generating QR Code", e);
            getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(p4, "FAILURE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generateQRCode$lambda$6(ImageView imageView, int i, int i2, BitMatrix bitMatrix, QrBridge qrBridge, String str) {
        toMagicModuleMetaRepoModel.write(imageView, "");
        toMagicModuleMetaRepoModel.write(bitMatrix, "");
        toMagicModuleMetaRepoModel.write(qrBridge, "");
        imageView.setImageBitmap(QrHelper.getBitMapFromBitMatrix(i, i2, bitMatrix));
        qrBridge.getBridgeComponents().getCallbackInvoker().invokeCallbackInDUIWebview(str, "SUCCESS");
    }

    @JavascriptInterface
    public final boolean checkQRScannerLibrary() {
        try {
            Class.forName("in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat");
            Class.forName("in.juspay.widget.qrscanner.com.google.zxing.EncodeHintType");
            Class.forName("in.juspay.widget.qrscanner.com.google.zxing.ResultPoint");
            Class.forName("in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix");
            Class.forName("in.juspay.widget.qrscanner.com.google.zxing.qrcode.QRCodeWriter");
            Class.forName("in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeCallback");
            Class.forName("in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeResult");
            Class.forName("in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.CaptureManager");
            Class.forName("in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.DecoratedBarcodeView");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean checkFirebaseScanner() {
        try {
            Class.forName("androidx.camera.core.CameraSelector");
            Class.forName("androidx.camera.core.ImageAnalysis");
            Class.forName("androidx.camera.core.ImageCapture");
            Class.forName("androidx.camera.core.ImageProxy");
            Class.forName("androidx.camera.core.Preview");
            Class.forName("androidx.camera.lifecycle.ProcessCameraProvider");
            Class.forName("androidx.camera.view.PreviewView");
            Class.forName("o._isNaN");
            Class.forName("o.hasGetter");
            Class.forName("com.google.mlkit.vision.barcode.BarcodeScannerOptions");
            Class.forName("com.google.mlkit.vision.barcode.BarcodeScanning");
            Class.forName("com.google.mlkit.vision.barcode.common.Barcode");
            Class.forName("com.google.mlkit.vision.common.InputImage");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // in.juspay.hyper.bridge.HyperBridge
    public final void reset() {
        this.listenerMap.clear();
    }

    @Override // in.juspay.hyper.bridge.HyperBridge
    public final boolean onActivityResult(int p0, int p1, Intent p2) {
        for (Object obj : this.listenerMap.values()) {
            if ((obj instanceof ResultAwaitingDuiHook) && ((ResultAwaitingDuiHook) obj).onActivityResult(p0, p1, p2)) {
                TrackerInterface trackerInterface = getBridgeComponents().getTrackerInterface();
                StringBuilder sb = new StringBuilder("Result consumed by ResultAwaitingDuiHook ");
                sb.append(obj.getClass().getName());
                trackerInterface.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, sb.toString());
                return true;
            }
        }
        return false;
    }

    private final void onNullParam(String p0, String p1) {
        StringBuilder sb = new StringBuilder("'");
        sb.append(p0);
        sb.append("' is null, returning.");
        JuspayLogger.d(LOG_TAG, sb.toString());
        CallbackInvoker callbackInvoker = getBridgeComponents().getCallbackInvoker();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        StringBuilder sb2 = new StringBuilder("'");
        sb2.append(p0);
        sb2.append("' NOT PROVIDED");
        byte[] bytes = sb2.toString().getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        String str = String.format("{\"error\":\"true\",\"data\":\"%s\"}", Arrays.copyOf(new Object[]{Base64.encodeToString(bytes, 2)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        callbackInvoker.invokeCallbackInDUIWebview(p1, str);
    }

    @Override // in.juspay.hyper.bridge.HyperBridge
    public final boolean onRequestPermissionResult(int p0, String[] p1, int[] p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Object obj = this.listenerMap.get("ReqPermi".concat(String.valueOf(p0)));
        if (!(obj instanceof Handler.Callback)) {
            return false;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = p2;
        ((Handler.Callback) obj).handleMessage(messageObtain);
        return true;
    }
}
