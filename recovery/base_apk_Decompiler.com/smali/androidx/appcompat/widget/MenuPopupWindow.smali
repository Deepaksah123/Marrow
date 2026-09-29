###### Class androidx.appcompat.widget.MenuPopupWindow (androidx.appcompat.widget.MenuPopupWindow)
.class public final Landroidx/appcompat/widget/MenuPopupWindow;
.super Landroidx/appcompat/widget/ListPopupWindow;
.source "SourceFile"

# interfaces
.implements Lo/create;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/MenuPopupWindow$IconCompatParcelizer;,
        Landroidx/appcompat/widget/MenuPopupWindow$read;,
        Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;
    }
.end annotation


# instance fields
.field private RemoteActionCompatParcelizer:Lo/create;


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .registers 5

    const/4 v0, 0x0

    .line 76
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroid/content/Context;Z)Lo/Keep;
    .registers 4

    .line 82
    new-instance v0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;

    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;-><init>(Landroid/content/Context;Z)V

    .line 83
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->setHoverListener(Lo/create;)V

    return-object v0
.end method

.method public final AudioAttributesCompatParcelizer(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)V
    .registers 3

    .line 124
    iget-object p0, p0, Landroidx/appcompat/widget/MenuPopupWindow;->RemoteActionCompatParcelizer:Lo/create;

    if-eqz p0, :cond_7

    .line 125
    invoke-interface {p0, p1, p2}, Lo/create;->AudioAttributesCompatParcelizer(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)V

    :cond_7
    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()V
    .registers 2

    .line 95
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/appcompat/widget/MenuPopupWindow$IconCompatParcelizer;->IconCompatParcelizer(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()V
    .registers 2

    .line 89
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/appcompat/widget/MenuPopupWindow$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    return-void
.end method

.method public final onAddQueueItem()V
    .registers 2

    .line 117
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/appcompat/widget/MenuPopupWindow$read;->AudioAttributesCompatParcelizer(Landroid/widget/PopupWindow;Z)V

    return-void
.end method

.method public final write(Lo/create;)V
    .registers 2

    .line 100
    iput-object p1, p0, Landroidx/appcompat/widget/MenuPopupWindow;->RemoteActionCompatParcelizer:Lo/create;

    return-void
.end method

.method public final write(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)V
    .registers 3

    .line 132
    iget-object p0, p0, Landroidx/appcompat/widget/MenuPopupWindow;->RemoteActionCompatParcelizer:Lo/create;

    if-eqz p0, :cond_7

    .line 133
    invoke-interface {p0, p1, p2}, Lo/create;->write(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)V

    :cond_7
    return-void
.end method

###### Class androidx.appcompat.widget.MenuPopupWindow.IconCompatParcelizer (androidx.appcompat.widget.MenuPopupWindow$IconCompatParcelizer)
.class Landroidx/appcompat/widget/MenuPopupWindow$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/MenuPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V
    .registers 2

    .line 269
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V

    return-void
.end method

.method static IconCompatParcelizer(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V
    .registers 2

    .line 274
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V

    return-void
.end method

###### Class androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView (androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView)
.class public Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;
.super Lo/Keep;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/MenuPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MenuDropDownListView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field final IconCompatParcelizer:I

.field final RemoteActionCompatParcelizer:I

.field private read:Lo/create;

.field private write:Landroid/view/MenuItem;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .registers 5

    .line 149
    invoke-direct {p0, p1, p2}, Lo/Keep;-><init>(Landroid/content/Context;Z)V

    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 152
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    const/4 p2, 0x1

    .line 154
    invoke-static {p1}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer;->IconCompatParcelizer(Landroid/content/res/Configuration;)I

    move-result p1

    const/16 v0, 0x15

    const/16 v1, 0x16

    if-ne p2, p1, :cond_1b

    .line 155
    iput v0, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->IconCompatParcelizer:I

    .line 156
    iput v1, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->RemoteActionCompatParcelizer:I

    return-void

    .line 158
    :cond_1b
    iput v1, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->IconCompatParcelizer:I

    .line 159
    iput v0, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic IconCompatParcelizer(Landroid/view/MotionEvent;I)Z
    .registers 3

    .line 140
    invoke-super {p0, p1, p2}, Lo/Keep;->IconCompatParcelizer(Landroid/view/MotionEvent;I)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic hasFocus()Z
    .registers 1

    .line 140
    invoke-super {p0}, Lo/Keep;->hasFocus()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic hasWindowFocus()Z
    .registers 1

    .line 140
    invoke-super {p0}, Lo/Keep;->hasWindowFocus()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic isFocused()Z
    .registers 1

    .line 140
    invoke-super {p0}, Lo/Keep;->isFocused()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic isInTouchMode()Z
    .registers 1

    .line 140
    invoke-super {p0}, Lo/Keep;->isInTouchMode()Z

    move-result p0

    return p0
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 203
    iget-object v0, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->read:Lo/create;

    if-eqz v0, :cond_5c

    .line 207
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 208
    instance-of v1, v0, Landroid/widget/HeaderViewListAdapter;

    if-eqz v1, :cond_19

    .line 209
    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    .line 210
    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v1

    .line 211
    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lo/onPreparePanel;

    goto :goto_1c

    .line 214
    :cond_19
    check-cast v0, Lo/onPreparePanel;

    const/4 v1, 0x0

    .line 219
    :goto_1c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_43

    .line 220
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0, v2, v3}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_43

    sub-int/2addr v2, v1

    if-ltz v2, :cond_43

    .line 223
    invoke-virtual {v0}, Lo/onPreparePanel;->getCount()I

    move-result v1

    if-ge v2, v1, :cond_43

    .line 224
    invoke-virtual {v0, v2}, Lo/onPreparePanel;->RemoteActionCompatParcelizer(I)Lo/onRetainNonConfigurationInstance;

    move-result-object v1

    goto :goto_44

    :cond_43
    const/4 v1, 0x0

    .line 229
    :goto_44
    iget-object v2, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->write:Landroid/view/MenuItem;

    if-eq v2, v1, :cond_5c

    .line 231
    invoke-virtual {v0}, Lo/onPreparePanel;->write()Lo/onRequestPermissionsResult;

    move-result-object v0

    if-eqz v2, :cond_53

    .line 233
    iget-object v3, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->read:Lo/create;

    invoke-interface {v3, v0, v2}, Lo/create;->write(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)V

    .line 236
    :cond_53
    iput-object v1, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->write:Landroid/view/MenuItem;

    if-eqz v1, :cond_5c

    .line 239
    iget-object v2, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->read:Lo/create;

    invoke-interface {v2, v0, v1}, Lo/create;->AudioAttributesCompatParcelizer(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)V

    .line 244
    :cond_5c
    invoke-super {p0, p1}, Lo/Keep;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 173
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/view/menu/ListMenuItemView;

    const/4 v1, 0x1

    if-eqz v0, :cond_29

    .line 174
    iget v2, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->IconCompatParcelizer:I

    if-ne p1, v2, :cond_29

    .line 175
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_28

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->IconCompatParcelizer()Lo/onRetainNonConfigurationInstance;

    move-result-object p1

    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->hasSubMenu()Z

    move-result p1

    if-eqz p1, :cond_28

    .line 178
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    .line 179
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    move-result-wide v2

    .line 176
    invoke-virtual {p0, v0, p1, v2, v3}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_28
    return v1

    :cond_29
    if-eqz v0, :cond_4f

    .line 182
    iget v0, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->RemoteActionCompatParcelizer:I

    if-ne p1, v0, :cond_4f

    const/4 p1, -0x1

    .line 183
    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 186
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p0

    .line 188
    instance-of p1, p0, Landroid/widget/HeaderViewListAdapter;

    if-eqz p1, :cond_44

    .line 189
    check-cast p0, Landroid/widget/HeaderViewListAdapter;

    .line 190
    invoke-virtual {p0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object p0

    check-cast p0, Lo/onPreparePanel;

    goto :goto_46

    .line 192
    :cond_44
    check-cast p0, Lo/onPreparePanel;

    .line 194
    :goto_46
    invoke-virtual {p0}, Lo/onPreparePanel;->write()Lo/onRequestPermissionsResult;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer(Z)V

    return v1

    .line 197
    :cond_4f
    invoke-super {p0, p1, p2}, Lo/Keep;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 140
    invoke-super {p0, p1}, Lo/Keep;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final bridge synthetic read(IIIII)I
    .registers 6

    .line 140
    invoke-super/range {p0 .. p5}, Lo/Keep;->read(IIIII)I

    move-result p0

    return p0
.end method

.method public setHoverListener(Lo/create;)V
    .registers 2

    .line 164
    iput-object p1, p0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->read:Lo/create;

    return-void
.end method

.method public bridge synthetic setSelector(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 140
    invoke-super {p0, p1}, Lo/Keep;->setSelector(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

###### Class androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView.IconCompatParcelizer (androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer)
.class Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method static IconCompatParcelizer(Landroid/content/res/Configuration;)I
    .registers 1

    .line 255
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p0

    return p0
.end method

###### Class androidx.appcompat.widget.MenuPopupWindow.read (androidx.appcompat.widget.MenuPopupWindow$read)
.class Landroidx/appcompat/widget/MenuPopupWindow$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/MenuPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/widget/PopupWindow;Z)V
    .registers 2

    .line 286
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setTouchModal(Z)V

    return-void
.end method
