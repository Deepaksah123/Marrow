package kotlin;

import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanGroup;
import com.marrow.data.models.plan.PlanGroupDescriptionModel;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.swap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016"}, d2 = {"Lo/stripCurlyBraces;", "Lo/SubtitleInputBuffer;", "Lo/swap$read;", "Lcom/marrow/data/models/plan/PlanGroup;", "Lo/swap$AudioAttributesCompatParcelizer;", "<init>", "()V", "Lcom/marrow/data/api/models/response/plan/Coupon;", "p0", "", "write", "(Lcom/marrow/data/api/models/response/plan/Coupon;)V", "", "p1", "IconCompatParcelizer", "(Lo/swap$read;I)V", "read", "()I", "", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "Lcom/marrow/data/api/models/response/plan/Coupon;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class stripCurlyBraces extends SubtitleInputBuffer<swap.read, PlanGroup> implements swap.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Coupon AudioAttributesCompatParcelizer;

    @Override // o.swap.AudioAttributesCompatParcelizer
    public final void write(Coupon p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = p0;
    }

    @Override // o.swap.AudioAttributesCompatParcelizer
    public final void write() {
        this.RemoteActionCompatParcelizer = true;
        e_(this.RemoteActionCompatParcelizer.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.SubtitleInputBuffer, kotlin.Cea608Decoder
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(swap.read p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.RemoteActionCompatParcelizer(p0, p1);
        Plan defaultPlan = ((PlanGroup[]) this.RemoteActionCompatParcelizer)[p1].getDefaultPlan(this.AudioAttributesCompatParcelizer);
        double discountedPrice = defaultPlan.getDiscountedPrice(this.AudioAttributesCompatParcelizer);
        String title = defaultPlan.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        p0.write(title);
        p0.read();
        if (defaultPlan.isProPlan() && defaultPlan.isVideoPlanCtype()) {
            p0.IconCompatParcelizer();
        } else {
            p0.AudioAttributesCompatParcelizer();
        }
        ArrayList<PlanGroupDescriptionModel> groupDescription = defaultPlan.getGroupDescription();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(groupDescription, "");
        Iterator<T> it = groupDescription.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlanGroupDescriptionModel planGroupDescriptionModel = (PlanGroupDescriptionModel) it.next();
            String planFeatureTitle = planGroupDescriptionModel.getPlanFeatureTitle();
            if (planFeatureTitle != null && planFeatureTitle.length() != 0) {
                p0.IconCompatParcelizer(planGroupDescriptionModel.getPlanFeatureTitle());
            }
            String[] descriptionList = planGroupDescriptionModel.getDescriptionList();
            if (descriptionList != null && descriptionList.length != 0) {
                String[] descriptionList2 = planGroupDescriptionModel.getDescriptionList();
                toMagicModuleMetaRepoModel.write(descriptionList2);
                for (String str : descriptionList2) {
                    String strMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strMediaBrowserCompatItemReceiver);
                    sb.append(" ");
                    sb.append(str);
                    p0.AudioAttributesCompatParcelizer(sb.toString());
                }
            }
        }
        double dFloor = Math.floor(discountedPrice);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        currencyInstance.setMaximumFractionDigits(0);
        String str2 = currencyInstance.format(dFloor);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        p0.read(str2);
        if (defaultPlan.getPrice() > discountedPrice) {
            p0.write();
            double dFloor2 = Math.floor(defaultPlan.getPrice());
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            currencyInstance2.setMaximumFractionDigits(0);
            String str3 = currencyInstance2.format(dFloor2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            p0.RemoteActionCompatParcelizer(str3);
            return;
        }
        p0.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.SubtitleInputBuffer, kotlin.Cea608Decoder
    public final int read() {
        return !this.RemoteActionCompatParcelizer ? Math.min(2, super.read()) : super.read();
    }
}
