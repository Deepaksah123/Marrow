package kotlin;

import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.PlanGroup;

/* JADX INFO: loaded from: classes3.dex */
public interface swap {

    public interface AudioAttributesCompatParcelizer extends Cea608Decoder<read, PlanGroup> {
        void write();

        void write(Coupon coupon);
    }

    public interface read extends invokeUpdateOutputInternal {
        void AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(String str);

        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(String str);

        void read();

        void read(String str);

        void write();

        void write(String str);
    }
}
