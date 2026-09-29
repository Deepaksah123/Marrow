package kotlin;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import kotlin._contains;

/* JADX INFO: loaded from: classes4.dex */
public abstract class _addSuperInterfaces extends BaseAdapter implements Filterable, _contains.write {
    private boolean AudioAttributesCompatParcelizer;
    private _contains AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private DataSetObserver AudioAttributesImplBaseParcelizer;
    protected boolean IconCompatParcelizer;
    private FilterQueryProvider MediaBrowserCompatItemReceiver;
    private Cursor RemoteActionCompatParcelizer;
    private IconCompatParcelizer read;
    private Context write;

    public abstract View IconCompatParcelizer(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public abstract void read(View view, Cursor cursor);

    public _addSuperInterfaces(Context context, Cursor cursor, boolean z) {
        write(context, null, 1);
    }

    private void write(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.AudioAttributesCompatParcelizer = true;
        } else {
            this.AudioAttributesCompatParcelizer = false;
        }
        boolean z = cursor != null;
        this.RemoteActionCompatParcelizer = cursor;
        this.IconCompatParcelizer = z;
        this.write = context;
        this.AudioAttributesImplApi26Parcelizer = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.read = new IconCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = new write();
        } else {
            this.read = null;
            this.AudioAttributesImplBaseParcelizer = null;
        }
        if (z) {
            IconCompatParcelizer iconCompatParcelizer = this.read;
            if (iconCompatParcelizer != null) {
                cursor.registerContentObserver(iconCompatParcelizer);
            }
            DataSetObserver dataSetObserver = this.AudioAttributesImplBaseParcelizer;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // o._contains.write
    public final Cursor AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.IconCompatParcelizer || (cursor = this.RemoteActionCompatParcelizer) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.IconCompatParcelizer || (cursor = this.RemoteActionCompatParcelizer) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.IconCompatParcelizer && (cursor = this.RemoteActionCompatParcelizer) != null && cursor.moveToPosition(i)) {
            return this.RemoteActionCompatParcelizer.getLong(this.AudioAttributesImplApi26Parcelizer);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.IconCompatParcelizer) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.RemoteActionCompatParcelizer.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(i)));
        }
        if (view == null) {
            view = IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, viewGroup);
        }
        read(view, this.RemoteActionCompatParcelizer);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.IconCompatParcelizer) {
            return null;
        }
        this.RemoteActionCompatParcelizer.moveToPosition(i);
        if (view == null) {
            view = RemoteActionCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, viewGroup);
        }
        read(view, this.RemoteActionCompatParcelizer);
        return view;
    }

    public View RemoteActionCompatParcelizer(Context context, Cursor cursor, ViewGroup viewGroup) {
        return IconCompatParcelizer(context, cursor, viewGroup);
    }

    @Override // o._contains.write
    public void read(Cursor cursor) {
        Cursor cursorWrite = write(cursor);
        if (cursorWrite != null) {
            cursorWrite.close();
        }
    }

    private Cursor write(Cursor cursor) {
        Cursor cursor2 = this.RemoteActionCompatParcelizer;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            IconCompatParcelizer iconCompatParcelizer = this.read;
            if (iconCompatParcelizer != null) {
                cursor2.unregisterContentObserver(iconCompatParcelizer);
            }
            DataSetObserver dataSetObserver = this.AudioAttributesImplBaseParcelizer;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.RemoteActionCompatParcelizer = cursor;
        if (cursor != null) {
            IconCompatParcelizer iconCompatParcelizer2 = this.read;
            if (iconCompatParcelizer2 != null) {
                cursor.registerContentObserver(iconCompatParcelizer2);
            }
            DataSetObserver dataSetObserver2 = this.AudioAttributesImplBaseParcelizer;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.AudioAttributesImplApi26Parcelizer = cursor.getColumnIndexOrThrow("_id");
            this.IconCompatParcelizer = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.IconCompatParcelizer = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    @Override // o._contains.write
    public CharSequence RemoteActionCompatParcelizer(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // o._contains.write
    public Cursor read(CharSequence charSequence) {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = new _contains(this);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    protected final void write() {
        Cursor cursor;
        if (!this.AudioAttributesCompatParcelizer || (cursor = this.RemoteActionCompatParcelizer) == null || cursor.isClosed()) {
            return;
        }
        this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.requery();
    }

    class IconCompatParcelizer extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        IconCompatParcelizer() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            _addSuperInterfaces.this.write();
        }
    }

    class write extends DataSetObserver {
        write() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            _addSuperInterfaces.this.IconCompatParcelizer = true;
            _addSuperInterfaces.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            _addSuperInterfaces.this.IconCompatParcelizer = false;
            _addSuperInterfaces.this.notifyDataSetInvalidated();
        }
    }
}
