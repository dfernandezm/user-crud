Ext.require('Ext.container.Viewport');

Ext.application({
    name: 'SanRosendo',
    launch: function() {
    	
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    title: 'Panadería San Rosendo',
                    html : 'Bienvenido!!'
                }
            ]
        });
    }
});