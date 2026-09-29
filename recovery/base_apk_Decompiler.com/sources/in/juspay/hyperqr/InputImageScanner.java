package in.juspay.hyperqr;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import in.juspay.hyper.core.JuspayLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lin/juspay/hyperqr/InputImageScanner;", "", "successCallback", "Lkotlin/Function1;", "", "", "failureCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "releaseResources", "scanImage", "inputImage", "Lcom/google/mlkit/vision/common/InputImage;", "hyper-qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InputImageScanner {
    private final getAnswerMap<String, getShowPopup> failureCallback;
    private BarcodeScanner scanner;
    private final getAnswerMap<String, getShowPopup> successCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public InputImageScanner(getAnswerMap<? super String, getShowPopup> getanswermap, getAnswerMap<? super String, getShowPopup> getanswermap2) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.successCallback = getanswermap;
        this.failureCallback = getanswermap2;
    }

    public final void scanImage(InputImage inputImage) {
        toMagicModuleMetaRepoModel.write(inputImage, "");
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(256, new int[]{4096}).build());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(client, "");
        this.scanner = client;
        if (client == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            client = null;
        }
        Task taskProcess = client.process(inputImage);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: in.juspay.hyperqr.InputImageScanner$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                InputImageScanner.scanImage$lambda$0(anonymousClass1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: in.juspay.hyperqr.InputImageScanner$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                InputImageScanner.scanImage$lambda$1(this.f$0, exc);
            }
        });
    }

    /* JADX INFO: renamed from: in.juspay.hyperqr.InputImageScanner$scanImage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "barcodes", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "kotlin.jvm.PlatformType", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<List<Barcode>, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* bridge */ /* synthetic */ getShowPopup invoke(List<Barcode> list) throws UnsupportedEncodingException {
            invoke2(list);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<Barcode> list) throws UnsupportedEncodingException {
            for (Barcode barcode : list) {
                if (barcode.getValueType() == 7 && barcode.getRawValue() != null) {
                    getAnswerMap getanswermap = InputImageScanner.this.successCallback;
                    String strEncode = URLEncoder.encode(barcode.getRawValue(), CharsetNames.UTF_8);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncode, "");
                    getanswermap.invoke(TestGroupLSModel.read(strEncode, "+", "%20", false));
                    return;
                }
            }
            InputImageScanner.this.failureCallback.invoke("Could not able to find any qr in image");
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scanImage$lambda$0(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scanImage$lambda$1(InputImageScanner inputImageScanner, Exception exc) {
        toMagicModuleMetaRepoModel.write(inputImageScanner, "");
        toMagicModuleMetaRepoModel.write(exc, "");
        inputImageScanner.failureCallback.invoke("exception on scanning image ".concat(String.valueOf(exc)));
        JuspayLogger.e("FirebaseQrScanner", "exception on scanning gallery image", exc);
    }

    public final void releaseResources() {
        BarcodeScanner barcodeScanner = this.scanner;
        if (barcodeScanner == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            barcodeScanner = null;
        }
        barcodeScanner.close();
    }
}
