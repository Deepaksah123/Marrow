package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.marrow.R;
import java.util.List;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes4.dex */
public final class fillColor extends BaseAdapter implements SpinnerAdapter {
    private List<String> RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    private Context read;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return i != 0;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public final void write(Context context, List<String> list) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        this.read = context;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = layoutInflaterFrom.inflate(R.layout.item_selected_year_signup, viewGroup, false);
            toMagicModuleMetaRepoModel.read(view, "");
        }
        TextView textView = (TextView) view;
        textView.setText(this.RemoteActionCompatParcelizer.get(i));
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = layoutInflaterFrom.inflate(R.layout.item_year_signup, viewGroup, false);
            toMagicModuleMetaRepoModel.read(view, "");
        }
        TextView textView = (TextView) view;
        Context context = null;
        if (i == 0) {
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context2 = this.read;
            if (context2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                context = context2;
            }
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceBgOutline, new TypedValue(), true));
        } else {
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.read;
            if (context3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                context = context3;
            }
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorOnSurface, new TypedValue(), true));
        }
        textView.setText(this.RemoteActionCompatParcelizer.get(i));
        return textView;
    }
}
