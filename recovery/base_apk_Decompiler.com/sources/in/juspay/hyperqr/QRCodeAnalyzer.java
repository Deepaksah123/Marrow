package in.juspay.hyperqr;

import android.media.Image;
import android.util.Base64;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import in.juspay.hyper.core.JuspayLogger;
import java.util.List;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.getSubmissionTimestamp;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lin/juspay/hyperqr/QRCodeAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "onQrCodeDetected", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "options", "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "getOptions", "()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "analyze", "imageProxy", "Landroidx/camera/core/ImageProxy;", "degreesToFirebaseRotation", "", "degrees", "getDefaultTargetResolution", "Landroid/util/Size;", "hyper-qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QRCodeAnalyzer implements ImageAnalysis.Analyzer {
    private final getAnswerMap<String, getShowPopup> onQrCodeDetected;
    private final BarcodeScannerOptions options;
    private final BarcodeScanner scanner;

    /* JADX WARN: Multi-variable type inference failed */
    public QRCodeAnalyzer(getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.onQrCodeDetected = getanswermap;
        BarcodeScannerOptions barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(256, new int[0]).build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(barcodeScannerOptionsBuild, "");
        this.options = barcodeScannerOptionsBuild;
        BarcodeScanner client = BarcodeScanning.getClient(barcodeScannerOptionsBuild);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(client, "");
        this.scanner = client;
    }

    public final BarcodeScannerOptions getOptions() {
        return this.options;
    }

    public final void analyze(final ImageProxy imageProxy) {
        toMagicModuleMetaRepoModel.write(imageProxy, "");
        Image image = imageProxy.getImage();
        if (image != null) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, degreesToFirebaseRotation(imageProxy.getImageInfo().getRotationDegrees()));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputImageFromMediaImage, "");
            Task taskProcess = this.scanner.process(inputImageFromMediaImage);
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: in.juspay.hyperqr.QRCodeAnalyzer$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    QRCodeAnalyzer.analyze$lambda$0(anonymousClass1, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: in.juspay.hyperqr.QRCodeAnalyzer$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    QRCodeAnalyzer.analyze$lambda$1(exc);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: in.juspay.hyperqr.QRCodeAnalyzer$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    QRCodeAnalyzer.analyze$lambda$2(imageProxy, task);
                }
            });
            return;
        }
        imageProxy.close();
    }

    /* JADX INFO: renamed from: in.juspay.hyperqr.QRCodeAnalyzer$analyze$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "barcodes", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "kotlin.jvm.PlatformType", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<List<Barcode>, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* bridge */ /* synthetic */ getShowPopup invoke(List<Barcode> list) {
            invoke2(list);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<Barcode> list) {
            for (Barcode barcode : list) {
                if (barcode.getValueType() == 7 && barcode.getRawValue() != null) {
                    getAnswerMap getanswermap = QRCodeAnalyzer.this.onQrCodeDetected;
                    String rawValue = barcode.getRawValue();
                    toMagicModuleMetaRepoModel.write((Object) rawValue);
                    byte[] bytes = rawValue.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
                    String strEncodeToString = Base64.encodeToString(bytes, 2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncodeToString, "");
                    getanswermap.invoke(strEncodeToString);
                    return;
                }
            }
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$0(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$1(Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        JuspayLogger.e("FirebaseQrScanner", "QR Code detection failed", exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$2(ImageProxy imageProxy, Task task) {
        toMagicModuleMetaRepoModel.write(imageProxy, "");
        toMagicModuleMetaRepoModel.write(task, "");
        imageProxy.close();
    }

    private final int degreesToFirebaseRotation(int degrees) {
        if (degrees == 0) {
            return 0;
        }
        int i = 90;
        if (degrees != 90) {
            i = 180;
            if (degrees != 180) {
                if (degrees == 270) {
                    return 270;
                }
                throw new IllegalArgumentException("Unsupported rotation degrees: ".concat(String.valueOf(degrees)));
            }
        }
        return i;
    }

    public final Size getDefaultTargetResolution() {
        return new Size(2560, 1440);
    }
}
