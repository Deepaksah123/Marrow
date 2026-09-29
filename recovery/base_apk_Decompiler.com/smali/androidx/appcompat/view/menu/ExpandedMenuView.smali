###### Class androidx.appcompat.view.menu.ExpandedMenuView (androidx.appcompat.view.menu.ExpandedMenuView)
.class public final Landroidx/appcompat/view/menu/ExpandedMenuView;
.super Landroid/widget/ListView;
.source "SourceFile"

# interfaces
.implements Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;
.implements Lo/registerForActivityResult;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field private static final write:[I


# instance fields
.field private read:Lo/onRequestPermissionsResult;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const v0, 0x10100d4

    const v1, 0x1010129

    .line 42
    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Landroidx/appcompat/view/menu/ExpandedMenuView;->write:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const v0, 0x1010074

    .line 53
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ExpandedMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 57
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    invoke-virtual {p0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 60
    sget-object v0, Landroidx/appcompat/view/menu/ExpandedMenuView;->write:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object p1

    .line 62
    invoke-virtual {p1, v1}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p2

    if-eqz p2, :cond_1a

    .line 63
    invoke-virtual {p1, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1a
    const/4 p2, 0x1

    .line 65
    invoke-virtual {p1, p2}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p3

    if-eqz p3, :cond_28

    .line 66
    invoke-virtual {p1, p2}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 68
    :cond_28
    invoke-virtual {p1}, Lo/setTitle;->write()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/onRequestPermissionsResult;)V
    .registers 2

    .line 73
    iput-object p1, p0, Landroidx/appcompat/view/menu/ExpandedMenuView;->read:Lo/onRequestPermissionsResult;

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z
    .registers 3

    .line 86
    iget-object p0, p0, Landroidx/appcompat/view/menu/ExpandedMenuView;->read:Lo/onRequestPermissionsResult;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/onRequestPermissionsResult;->IconCompatParcelizer(Landroid/view/MenuItem;I)Z

    move-result p0

    return p0
.end method

.method protected final onDetachedFromWindow()V
    .registers 2

    .line 78
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ExpandedMenuView;->setChildrenDrawingCacheEnabled(Z)V

    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6

    .line 92
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    invoke-interface {p1, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/onRetainNonConfigurationInstance;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/ExpandedMenuView;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z

    return-void
.end method
